import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
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
            this.plantel.add(new Guarda_redes());
        }
        for (int i=0;i<4;i++){
            this.plantel.add(new Defesa());
        }
        for (int i=0;i<4;i++){
            this.plantel.add(new Lateral());
        }
        for (int i=0;i<7;i++){
            this.plantel.add(new Medio());
        }
        for (int i=0;i<7;i++){
            this.plantel.add(new Avancado());
        }
        Random nome = new Random();
        this.nomeEquipa = "Equipa " + nome.nextInt(1000);
        //confirmaNumeros();
        criarTitular();
        criarSuplentes();
    }
    
    public String getNomeEquipa(){
        return this.nomeEquipa;
    }
    
    public void setNomeEquipa(String nome){
        this.nomeEquipa = nome;
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
            habilidade += this.titular.get(i).getHabilidade();  
        }
        habilidade = habilidade/11;
        return habilidade;
    }
    
    /**
     * Cria um 11 titular. Para este onze sao selecionados os melhores jogadores do plantel.
     */
    public void criarTitular (){  
        for (int i = 0; i < this.plantel.size(); i++){
            switch(this.plantel.get(i).getPosicao()){
                case ("Guarda-redes"): addTitulares("Guarda-redes", 1, i); break;
                case ("Defesa"): addTitulares("Defesa", 2, i); break;
                case ("Lateral"): addTitulares("Lateral", 2, i); break;
                case ("Medio"): addTitulares("Medio", 3, i); break;
                case ("Avancado"): addTitulares("Avancado", 3, i); break;
            }
        }
    }
        
    /**
     * Adiciona um jogador aos titulares se nao tiver nenhum jogador da sua posiçao ou se forem piores que ele.
     * 
     * @param posicao Posicao a procurar.
     * @param quantos Quantos jogadores dessa posiçao devem estar nos titulares.
     * @param i Indice do array.
     */
    public void addTitulares (String posicao, int quantos, int i){
        if (quantosPosTitular(posicao) < quantos) 
                this.titular.add(this.plantel.get(i));
        else if (quantosPosTitular(posicao) == quantos &&
        this.plantel.get(i).getHabilidade() > this.titular.get(getPiorTitular(posicao)).getHabilidade()) { 
                this.titular.set(getPiorTitular(posicao), this.plantel.get(i));
            }
    }
    
    /**
     * Indica quantos jogador de uma certa posicao existem nos titulares.
     * 
     * @param posiçao Posicao a procurar.
     * @return quantos Quantos jogadores estao da posicao recebida nos titulares.
     */
    public int quantosPosTitular (String posicao){
        int quantos = 0;
        for (int i = 0; i < this.titular.size(); i++){
            if (this.titular.get(i).getPosicao() == posicao)
                quantos++;
        }
        return quantos;
    }
    
    /**
     * Indica o indice em que esta inserido o pior jogador de uma dada posicao nos titulares.
     * 
     * @param posicao Posiçao a procurar.
     * @return pior Indice do pior jogador nos titulares da posiçao recebida.
     */
    public int getPiorTitular (String posicao){
        int pior = -1;
        double habilidade = 101;
        for (int i = 0; i < this.titular.size(); i++) {
            if (this.titular.get(i).getPosicao() == posicao && this.titular.get(i).getHabilidade() < habilidade){        
                pior = i;
                habilidade = this.titular.get(i).getHabilidade();
            }
        }
        return pior;
    }
    
    public void criarSuplentes (){
        for (int i = 0; i < this.plantel.size(); i++){
            if (!estaNosTitulares(this.plantel.get(i))) {
                switch (this.plantel.get(i).getPosicao()) {
                    case ("Guarda-redes"):
                        addSuplentes("Guarda-redes", 1, i); break;
                    case ("Defesa"):
                        addSuplentes("Defesa", 1, i); break;
                    case ("Lateral"):
                        addSuplentes("Lateral", 1, i); break;
                    case ("Medio"):
                        addSuplentes("Medio", 2, i); break;
                    case ("Avancado"):
                        addSuplentes("Avancado", 2, i); break;
                }
            }
        }
    }
    
    public void addSuplentes (String posicao,int quantos, int i){
        if (quantosPosSuplentes(posicao) < quantos)
            this.suplentes.add(this.plantel.get(i));
            else if (quantosPosSuplentes(posicao) == quantos && 
            this.plantel.get(i).getHabilidade() > this.suplentes.get(getPiorSuplentes(posicao)).getHabilidade()) {
                this.suplentes.set(getPiorSuplentes(posicao),this.plantel.get(i));
        }
    }
    

    public boolean estaNosTitulares (Jogador jogador){
        for (int i = 0; i < this.titular.size(); i++){
            if (this.titular.get(i).equals(jogador)) return true;
        }
        return false;
    }
    
    public boolean estaNosSuplentes (Jogador jogador){
        for (int i = 0; i < this.suplentes.size(); i++){
            if (this.suplentes.get(i).equals(jogador)) return true;
        }
        return false;
    }
        

    public int quantosPosSuplentes(String posicao) {
        int quantos = 0;
        for (int i = 0; i<this.suplentes.size(); i++) {
            if (this.suplentes.get(i).getPosicao() == posicao) quantos++;
        }
        return quantos;
    }
    
    public int getPiorSuplentes (String posicao){
        int pior = -1;
        double habilidade = 101;
        for (int i = 0; i < this.suplentes.size(); i++) {
            if (this.suplentes.get(i).getPosicao() == posicao && this.suplentes.get(i).getHabilidade() < habilidade){        
                pior = i;
                habilidade = this.suplentes.get(i).getHabilidade();
            }
        }
        return pior;
    }
    
    public int getIndiceTitular (Jogador jogador) {
        for (int i = 0 ; i < this.titular.size(); i++){
            if (this.titular.get(i).equals(jogador)) return i;
        }
        return -1;
    }
    
    public int getIndiceSuplentes (Jogador jogador) {
        for (int i = 0; i < this.titular.size(); i++){
            if (this.suplentes.get(i).equals(jogador)) return i;
        }
        return -1;
    }
    /*
    public void gestaoEquipa (Jogador j1,Jogador j2) {
        if
    }
    */
    public void substituicaoIG(Jogador j1,Jogador j2) {
        if (estaNosTitulares(j1) && estaNosSuplentes(j2) ) {
            trocaJog(getIndiceTitular(j1), getIndiceSuplentes(j2));
        }
        else if (estaNosTitulares(j2) && estaNosSuplentes(j1)) {
            trocaJog(getIndiceTitular(j2), getIndiceSuplentes(j1));
        }
    }
    
    public void trocaJog(int j1, int j2) {
        Jogador novo = this.titular.get(j1);
        this.titular.set(j1, this.suplentes.get(j2));
        this.suplentes.set(j2, novo);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da equipa: ").append(getNomeEquipa() + "\n");
        sb.append("11 Titular:\n");
        for (Jogador a : titular){
            sb.append(a.getNomeJogador() + " ").append(a.getHabilidade() + " ").append(a.getPosicao()).append("\n");
        }
        sb.append("Suplentes:\n");
        for (Jogador a : suplentes){
            sb.append(a.getNomeJogador() + " ").append(a.getHabilidade() + " ").append(a.getPosicao()).append("\n");
        }
        sb.append("Plantel:\n");
        for (Jogador a : plantel){
            sb.append(a.getNomeJogador() + " ").append(a.getHabilidade() + " ").append(a.getPosicao()).append("\n");
        }
        return sb.toString();
    }
}

        