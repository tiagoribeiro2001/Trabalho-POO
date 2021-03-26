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
    
    /**
     * Construtor sem argumentos. Cria uma equipa com jogadores randomizados. 
     */
    public Equipa() {
    
        this.plantel = new ArrayList<Jogador>();
        this.titular = new ArrayList<Jogador>();
        this.suplentes = new ArrayList<Jogador>();
        for (int i=0;i<3;i++){
            this.plantel.add(new Jogador("Guarda-redes"));
        }
        for (int i=0;i<4;i++){
            this.plantel.add(new Jogador("Lateral"));
        }
        for (int i=0;i<4;i++){
            this.plantel.add(new Jogador("Defesa"));
        }
        for (int i=0;i<7;i++){
            this.plantel.add(new Jogador("Medio"));
        }
        for (int i=0;i<7;i++){
            this.plantel.add(new Jogador("Avançado"));
        }
        Random nome = new Random();
        this.nomeEquipa = "Equipa " + nome.nextInt(1000);
        //confirmaNumeros();
        criarTitular();
        //criarSuplentes();
    }
    
    /**
     * Calcula a habilidade de uma equipa, valor de 0 a 100. 
     * A importancia de cada habilidade varia de posiçao para posiçao, logo diferentes habilidades sao tidas mais em conta para calcular a habilidade de um jogador de uma certa posiçao.
     * A habilidade da equipa e calculada a partir da media dos 11 jogadores titulares.
     * 
     * @return habilidade Habilidade do jogador.
     */
    public double getHabilidadeEquipa (){
        double habilidade= 0.0;
        for (int i = 0; i < 11;i++) {
            habilidade += this.titular.get(i).getHabilidadeJogador();  
        }
        habilidade = habilidade/11;
        return habilidade;
    }
    
    /**
     * Cria um 11 titular. Para este onze sao selecionados os melhores jogadores do plantel.
     */
    public void criarTitular (){  
        for (int i = 0; i < this.plantel.size(); i++){
            switch(this.plantel.get(i).getPosiçao()){
                case ("Guarda-redes"):
                    addTitulares("Guarda-redes", 1, i); break;
                case ("Defesa"):
                    addTitulares("Defesa", 2, i); break;
                case ("Lateral"):
                    addTitulares("Lateral", 2, i); break;
                case ("Medio"):
                    addTitulares("Medio", 3, i); break;
                case ("Avançado"):
                    addTitulares("Avançado", 3, i); break;
            }
        }
    }
        
            
            
            
            /*
            if (this.plantel.get(i).getPosiçao() == "Guarda-redes" && quantosGr()<1) 
                this.titular.add(this.plantel.get(i));
            else if (this.plantel.get(i).getPosiçao() == "Guarda-redes" && quantosGr()==1 &&
            this.titular.get(getGR()).getHabilidadeJogador() < this.plantel.get(i).getHabilidadeJogador()) {
                this.titular.set(getGR(),this.plantel.get(i));
            }
            else if (this.plantel.get(i).getPosiçao() == "Defesa" && quantosDef()<2) 
                this.titular.add(this.plantel.get(i));
            else if (this.plantel.get(i).getPosiçao() == "Defesa" && quantosDef()==2 &&
            this.plantel.get(i).getHabilidadeJogador() > this.titular.get(getDef()).getHabilidadeJogador()) { 
                this.titular.set(getDef(),this.plantel.get(i));
            }
            else if (this.plantel.get(i).getPosiçao() == "Lateral" && quantosLat()<2) 
                this.titular.add(this.plantel.get(i));
            else if (this.plantel.get(i).getPosiçao() == "Lateral" && quantosLat()==2 &&
            this.plantel.get(i).getHabilidadeJogador() > this.titular.get(getLat()).getHabilidadeJogador()) { 
                this.titular.set(getLat(),this.plantel.get(i));
            }
            else if (this.plantel.get(i).getPosiçao() == "Medio" && quantosMed()<3) 
                this.titular.add(this.plantel.get(i));
            else if (this.plantel.get(i).getPosiçao() == "Medio" && quantosMed()==3 &&
            this.plantel.get(i).getHabilidadeJogador() > this.titular.get(getMed()).getHabilidadeJogador()) { 
                this.titular.set(getMed(),this.plantel.get(i));
            }
            else if (this.plantel.get(i).getPosiçao() == "Avançado" && quantosAv()<3) 
                this.titular.add(this.plantel.get(i));
            else if (this.plantel.get(i).getPosiçao() == "Avançado" && quantosAv()==3 &&
            this.plantel.get(i).getHabilidadeJogador() > this.titular.get(getAv()).getHabilidadeJogador()) { 
                this.titular.set(getAv(),this.plantel.get(i));
            
            }
            */

    /*
    public void criarSuplentes (){
        for (int i=0;i<this.plantel.size();i++){
            if (estaNosTitulares(this.plantel.get(i))==false){
                if (this.plantel.get(i).getPosiçao()=="guarda-redes" && quantos("guarda-redes")<1) this.suplentes.add(this.plantel.get(i));
                else if (this.plantel.get(i).getPosiçao()=="guarda-redes" && quantos("guarda-redes")==1 && 
                this.plantel.get(i).getHabilidadeJogador()>this.suplentes.get(getGeral("guarda-redes")).getHabilidadeJogador()){
                    this.suplentes.set(getGeral("guarda-redes"),this.plantel.get(i));
                }
                
            }       
        }
    }*/
    
    /*
    public boolean estaNosTitulares (Jogador Jogador){}
    
    public void substituir(int entra,int sai){
    }
    
    public void transfere (Jogador jogador, Equipa equipa){
    }
    
    public int quantosGr () {
        int x=0;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosiçao() == "guarda-redes")  x++;
        }
        return x;
    }
    
    public int quantosDef () {
        int x=0;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosiçao() == "defesa")  x++;
        }
        return x;
    }
    
    public int quantosLat () {
        int x=0;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosiçao() == "lateral")  x++;
        }
        return x;
    }
    
    public int quantosAv (){
        int x=0;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosiçao() == "avançado")  x++;
        }
        return x;
    }
    
    public int quantosMed () {
        int x=0;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosiçao() == "medio")  x++;
        }
        return x;
    }
    
    public int getGR() {
        int i;
        for (i=0;this.titular.get(i).getPosiçao()!="guarda-redes";i++);
        return i;
    }
    
    */
    /**
     * Indica o indice em que esta inserido o pior jogador de uma dada posiçao nos titulares.
     * 
     * @param posiçao Posiçao a procurar.
     * @return pior Indice do pior jogador nos titulares da posiçao recebida.
     */
    public int getPiorTitular (String posiçao){
        int pior = -1;
        double habilidade = 101;
        for (int i = 0; i < this.titular.size(); i++) {
            if (this.titular.get(i).getPosiçao() == posiçao && this.titular.get(i).getHabilidadeJogador() < habilidade){        
                pior = i;
                habilidade=this.titular.get(i).getHabilidadeJogador();
            }
        }
        return pior;
    }
    
    /**
     * Indica quantos jogador de uma certa posicao existem nos titulares.
     * 
     * @param posiçao Posiçao a procurar.
     * @return quantos Quantos jogadores estao da posicao recebida nos titulares.
     */
    public int quantosPosTitular (String posiçao){
        int quantos = 0;
        for (int i = 0; i < this.titular.size(); i++){
            if (this.titular.get(i).getPosiçao() == posiçao)
                quantos++;
        }
        return quantos;
    }
    
    /**
     * Adiciona um jogador aos titulares se nao tiver nenhum jogador da sua posiçao ou se forem piores que ele.
     * 
     * @param posiçao Posiçao a procurar.
     * @param quantos Quantos jogadores dessa posiçao devem estar nos titulares.
     * @param i Indice do array.
     */
    public void addTitulares (String posiçao, int quantos, int i){
        if (quantosPosTitular(posiçao) < quantos) 
                this.titular.add(this.plantel.get(i));
        else if (quantosPosTitular(posiçao) == quantos && this.plantel.get(i).getHabilidadeJogador() > this.titular.get(getPiorTitular(posiçao)).getHabilidadeJogador()) { 
                this.titular.set(getPiorTitular(posiçao), this.plantel.get(i));
            }
    }
    
    public int getDef() {
        int pior=-1;
        double habilidade=101;
        for (int i=0;i<this.titular.size();i++) {
            if (this.titular.get(i).getPosiçao() == "defesa" && this.titular.get(i).getHabilidadeJogador() < habilidade){        
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
            if (this.titular.get(i).getPosiçao() == "lateral" && this.titular.get(i).getHabilidadeJogador() < habilidade){        
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
            if (this.titular.get(i).getPosiçao() == "medio" && this.titular.get(i).getHabilidadeJogador() < habilidade){        
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
            if (this.titular.get(i).getPosiçao() == "avançado" && this.titular.get(i).getHabilidadeJogador() < habilidade){        
                pior = i;
                habilidade=this.titular.get(i).getHabilidadeJogador();
            }
        }
        return pior;
    }
    
    public int quantos(String posicao) {
        int x=0;
        for (int i=0;i<this.suplentes.size();i++) {
            if (this.suplentes.get(i).getPosiçao() == posicao)  x++;
        }
        return x;
    }
    
    public int getGeral (String posicao) {
        int i;
        for (i = 0; this.suplentes.get(i).getPosiçao() != posicao; i++);
        return i;
    }
}


        