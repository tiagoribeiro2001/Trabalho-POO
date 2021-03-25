/**  * Classe Encomenda  */
/** Trabalho feito por João Vitor a93170 */
import java.util.Date;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.Iterator;


public class Encomenda{
    //Variaveis de instancia
    private String cliente;
    private int nif;
    private String morada;
    private int numEnc;
    private LocalDate data;
    private List<LinhaEncomenda> lista;
       
    public Encomenda(){
        this.cliente= "";
        this.nif= 0;
        this.morada= "";
        this.numEnc= 0;
        this.data= LocalDate.now();
        this.lista= new ArrayList<>();
    }
    
    public Encomenda(String client, int nif, String morada, int num, LinhaEncomenda box){
        this.cliente= client;
        this.nif= nif;
        this.morada= morada;
        this.numEnc= num;
        this.data= LocalDate.now();
        this.lista= new ArrayList<>();
        this.lista.add(box);
    }
    
    public Encomenda(Encomenda j){
        this.cliente= j.cliente;
        this.nif= j.nif;
        this.morada= j.morada;
        this.numEnc= j.numEnc;
        this.data= j.data;
        
        this.lista= new ArrayList<> (j.lista);
    }
    
    public String getclienteNome(){
        return this.cliente;
    }
    
    public int getNif(){
        return this.nif;
    }
    
    public String getMorada(){
        return this.morada;
    }
    
    public int getNumEnc(){
        return this.numEnc;
    }
    
    public LocalDate getDataEncomenda(){
        return this.data;
    }
    
    public ArrayList getLista(){
        return (ArrayList)this.lista;
    }
    
    public void setNomeCliente(String nome){
        this.cliente= nome;
    }
    
    public void setNif(int nif){
        this.nif= nif;
    }
    
    public void setMorada(String morada){
        this.morada= morada;
    }
    
    public void setNumeroEncomenda(int numero){
        this.numEnc= numero;
    }
    
    public void setDataEncomenda(LocalDate data){
        this.data= data;
    }
    
    public void setLista(ArrayList box){
        this.lista= new ArrayList<>(box);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do cliente: ").append(getclienteNome());
        sb.append("\nNif: ").append(getNif());
        sb.append("\nMorada: ").append(getMorada());
        sb.append("\nNumero da encomenda: ").append(getNumEnc());
        sb.append("\nData: ").append(getDataEncomenda());
        sb.append("\nLista de encomendas: ");
        sb.append(this.lista.toString());
        
        return sb.toString();
    }
    
    public double calculaValorTotal(){
        double x= 0;
        for(LinhaEncomenda enc: this.lista) {
            x= x + enc.calculaValorLinhaEnc();
        }
        return x;
    }
    
    public double calculaValorDesconto(){
        double x= 0;
        for(LinhaEncomenda enc: this.lista) {
            x+= enc.calculaValorDesconto();
        }
        return x;
    }
    
    public int numeroTotalProdutos(){
        int x= 0;
        for(LinhaEncomenda enc: this.lista){
            x = x + enc.getQuantidade();
        }
        return x;
    }
    
    public boolean existeProdutoEncomenda(String refProduto){
        for(LinhaEncomenda enc: this.lista){
            if(enc.getReferencia() == refProduto){
                return true;
        }
    }
        return false;
    }
    
    public void adicionaLinha(LinhaEncomenda linha){
        this.lista.add(linha);
    }
    
    public void removeProduto(String codProd){ 
            boolean x = true;
            Iterator<LinhaEncomenda> lista= this.lista.iterator();
            LinhaEncomenda linha;
            while(lista.hasNext() && x){
                linha= lista.next();
                if(linha.getReferencia()== codProd){
                    x= false;
                    this.lista.remove(linha);
                }
            }
        }
}
