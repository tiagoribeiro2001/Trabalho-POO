import java.util.ArrayList;
import java.util.Random;
/**
 * Escreva a descrição da classe Equipa aqui.
 * 
 * @author (tropa) 
 * @version (segunda)
 */
public class Equipa{
    private ArrayList<Jogador> plantel,titular,suplentes;
    private String nomeEquipa;
    public Equipa() {
    
        this.plantel = new ArrayList<Jogador>();
        this.titular = new ArrayList<Jogador>();
        this.suplentes = new ArrayList<Jogador>();
        for (int i=0;i<3;i++){
            this.plantel.add(new Jogador("guarda-redes"));
        }
        for (int i=0;i<4;i++){
            this.plantel.add(new Jogador("lateral"));
        }
        for (int i=0;i<4;i++){
            this.plantel.add(new Jogador("defesa"));
        }
        for (int i=0;i<7;i++){
            this.plantel.add(new Jogador("medio"));
        }
        for (int i=0;i<7;i++){
            this.plantel.add(new Jogador("avançado"));
        }
        Random nome = new Random();
        this.nomeEquipa = "Equipa " + nome.nextInt(1000);
        confirmaNumeros();
        criarTitular();
        criarSuplentes();
    }
    
    public double getHabilidadeEquipa (){
        double habilidade= 0.0;
        for (int i = 0; i < 11;i++) {
            habilidade += this.titular.get(i).getHabilidadeJogador();  
        }
        habilidade = habilidade/11;

        return habilidade;
    }
    
    public void criarTitular (){  
        for (int i = 0; i < this.plantel.size(); i++){
            if (this.plantel.get(i).getPosicao() == "guarda-redes" && quantosGr()<1) 
                this.titular.add(this.plantel.get(i));
            else if (this.plantel.get(i).getPosicao() == "guarda-redes" && quantosGr()==1 &&
            this.titular.get(getGR()).getHabilidadeJogador() < this.plantel.get(i).getHabilidadeJogador()) {
                this.titular.set(getGR(),this.plantel.get(i));
            }
            else if (this.plantel.get(i).getPosicao() == "defesa" && quantosDef()<2) 
                this.titular.add(this.plantel.get(i));
            else if (this.plantel.get(i).getPosicao() == "defesa" && quantosDef()==2 &&
            this.plantel.get(i).getHabilidadeJogador() > this.titular.get(getDef()).getHabilidadeJogador()) { 
                this.titular.set(getDef(),this.plantel.get(i));
            }
            else if (this.plantel.get(i).getPosicao() == "lateral" && quantosLat()<2) 
                this.titular.add(this.plantel.get(i));
            else if (this.plantel.get(i).getPosicao() == "lateral" && quantosLat()==2 &&
            this.plantel.get(i).getHabilidadeJogador() > this.titular.get(getLat()).getHabilidadeJogador()) { 
                this.titular.set(getLat(),this.plantel.get(i));
            }
            else if (this.plantel.get(i).getPosicao() == "medio" && quantosMed()<3) 
                this.titular.add(this.plantel.get(i));
            else if (this.plantel.get(i).getPosicao() == "medio" && quantosMed()==3 &&
            this.plantel.get(i).getHabilidadeJogador() > this.titular.get(getMed()).getHabilidadeJogador()) { 
                this.titular.set(getMed(),this.plantel.get(i));
            }
            else if (this.plantel.get(i).getPosicao() == "avançado" && quantosAv()<3) 
                this.titular.add(this.plantel.get(i));
            else if (this.plantel.get(i).getPosicao() == "avançado" && quantosAv()==3 &&
            this.plantel.get(i).getHabilidadeJogador() > this.titular.get(getAv()).getHabilidadeJogador()) { 
                this.titular.set(getAv(),this.plantel.get(i));
            }
        }
    }
    public void criarSuplentes (){
        for (int i=0;i<this.plantel.size();i++){
            if (estaNosTitulares(this.plantel.get(i))==false){
                if (this.plantel.get(i).getPosicao()=="guarda-redes" && quantos("guarda-redes")<1) this.suplentes.add(this.plantel.get(i));
                else if (this.plantel.get(i).getPosicao()=="guarda-redes" && quantos("guarda-redes")==1 && 
                this.plantel.get(i).getHabilidadeJogador()>this.suplentes.get(getGeral("guarda-redes")).getHabilidadeJogador()){
                    this.suplentes.set(getGeral("guarda-redes"),this.plantel.get(i));
                }
                
            }       
        }
    }
    public boolean estaNosTitulares (Jogador Jogador){}
    public void substituir(int entra,int sai){
    }
    
    public void transfere (Jogador jogador, Equipa equipa){
    }
    
    public int quantosGr () {
        int x=0;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosicao() == "guarda-redes")  x++;
    }
    return x;
}
    public int quantosDef () {
                int x=0;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosicao() == "defesa")  x++;
    }
    return x;
    }
    public int quantosLat () {
                int x=0;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosicao() == "lateral")  x++;
    }
    return x;
    }
    public int quantosAv (){
            int x=0;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosicao() == "avançado")  x++;
    }
    return x;
    }
    
    public int quantosMed () {
            int x=0;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosicao() == "medio")  x++;
    }
    return x;
    }
    
    public int getGR() {
        int i;
        for (i=0;this.titular.get(i).getPosicao()!="guarda-redes";i++);
        return i;
    }
    
    public int getDef() {
        int pior=-1;
        double habilidade=101;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosicao() == "defesa" && this.titular.get(i).getHabilidadeJogador() < habilidade){        
                pior = i;
                habilidade=this.titular.get(i).getHabilidadeJogador();
            }
        }
        return pior;
    }        
    public int getLat() {
        int pior=-1;
        double habilidade=101;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosicao() == "lateral" && this.titular.get(i).getHabilidadeJogador() < habilidade){        
                pior = i;
                habilidade=this.titular.get(i).getHabilidadeJogador();
            }
        }
        return pior;
    }
    public int getMed() {
        int pior=-1;
        double habilidade=101;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosicao() == "medio" && this.titular.get(i).getHabilidadeJogador() < habilidade){        
                pior = i;
                habilidade=this.titular.get(i).getHabilidadeJogador();
            }
        }
        return pior;
    }
    public int getAv() {
        int pior=-1;
        double habilidade=101;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosicao() == "avançado" && this.titular.get(i).getHabilidadeJogador() < habilidade){        
                pior = i;
                habilidade=this.titular.get(i).getHabilidadeJogador();
            }
        }
        return pior;
    }
    public int quantos(String posicao) {
                    int x=0;
        for (int i=0;i<this.suplentes.size();i++) {
            if (this.suplentes.get(i).getPosicao() == posicao)  x++;
    }
    return x;
    }
    
    public int getGeral (String posicao) {
        int i;
        for (i=0;this.suplentes.get(i).getPosicao()!=posicao;i++);
        return i;
    }
}


        