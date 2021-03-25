import java.util.ArrayList;
import java.util.Random;

public class Jogador
{
    private int vel, resis, destr, impuls, cabec, remate, passe, numero, elast;
    private ArrayList<String> historico;
    private String posicao, nome;
    
    //Metodos construtores
    
    /**
     * Construtor sem argumentos. 
     * Cria um Jogador com cada variavel de instancia com um numero randomizado de 0 a 100.
     */
    public Jogador(){
        Random number = new Random();
        this.vel = number.nextInt(100);
        this.resis = number.nextInt(100);
        this.destr = number.nextInt(100);
        this.impuls = number.nextInt(100);
        this.cabec = number.nextInt(100);
        this.remate = number.nextInt(100);
        this.passe = number.nextInt(100);
        this.numero = number.nextInt(98)+1;
        this.elast = number.nextInt(100);
        this.historico = new ArrayList<String>();
        switch (number.nextInt(4)){
            case 0: this.posicao = "guarda-redes"; break;
            case 1: this.posicao = "defesa"; break;
            case 2: this.posicao = "medio"; break;
            case 3: this.posicao = "avançado"; break;
            case 4: this.posicao = "lateral"; break;
        }
        this.nome = "Jogador " + number.nextInt(1000);
    }
  
    
    public Jogador(String posicao){
        Random number = new Random();
        this.vel = number.nextInt(100);
        this.resis = number.nextInt(100);
        this.destr = number.nextInt(100);
        this.impuls = number.nextInt(100);
        this.cabec = number.nextInt(100);
        this.remate = number.nextInt(100);
        this.passe = number.nextInt(100);
        this.numero = number.nextInt(100);
        this.elast = number.nextInt(100);
        this.historico = new ArrayList<String>();
        this.posicao = posicao;
        this.nome = "";
    }    
    
    
    public Jogador(int vel, int resis, int destr, int impuls, int cabec, int remate, int passe, int numero, int elast, ArrayList<String> historico, String posicao, String nome){
        this.vel = vel;
        this.resis = resis;
        this.destr = destr;
        this.impuls = impuls;
        this.cabec = cabec;
        this.remate = remate;
        this.passe = passe;
        this.numero = numero;
        this.historico = historico;
        this.posicao = posicao;
        this.elast = elast;
        this.nome = nome;
    }
    
    
    public Jogador(Jogador jogador){
        this.vel = jogador.getVelocidade();
        this.resis = jogador.getResis();
        this.destr = jogador.getDestr();
        this.impuls = jogador.getImpuls();
        this.cabec = jogador.getCabec();
        this.remate = jogador.getRemate();
        this.passe = jogador.getPasse();
        this.numero = jogador.getNumero();
        this.historico = jogador.getHistorico();
        this.posicao = jogador.getPosicao();
        this.nome = jogador.getNome();
        this.elast = jogador.getElast();
    }

    //Getters
    
    public int getVelocidade(){
        return this.vel;
    }

    public int getResis(){
        return this.resis;
    }

    public int getDestr(){
        return this.destr;
    }

    public int getImpuls(){
        return this.impuls;
    }

    public int getCabec(){
        return this.cabec;
    }

    public int getRemate(){
        return this.remate;
    }

    public int getPasse(){
        return this.passe;
    }

    public int getNumero(){
        return this.numero;
    }

    public ArrayList<String> getHistorico(){
        return this.historico;
    }

    public String getPosicao(){
        return this.posicao;
    }

    public String getNome(){
        return this.nome;
    }
    
    public int getElast(){
        return this.elast;
    }

    public double getHabilidadeJogador(){
        double habilidade = 0;
        switch (this.posicao){
            case ("guarda-redes"): habilidade = 0.45 * this.elast + 0.25 * this.impuls + 0.05 * this.vel + 0.05 * this.passe +
                0.05 * this.remate + 0.05 * this.cabec + 0.05 * this.destr + 0.05 * this.resis; break;
            case ("defesa"): habilidade = 0.3 * this.impuls + 0.1 * this.vel + 0.1 * this.passe + 0.05 * this.remate +
                0.3 * this.cabec + 0.05 * this.destr + 0.1 * this.resis; break;
            case ("medio"): habilidade = 0.05 * this.impuls + 0.1 * this.vel + 0.3 * this.passe + 0.15 * this.remate +
                0.05 * this.cabec + 0.25 * this.destr + 0.1 * this.resis; break;
            case ("avançado"): habilidade = 0.1 * this.impuls + 0.15 * this.vel + 0.1 * this.passe + 0.3 * this.remate + 
                0.15 * this.cabec + 0.15 * this.destr + 0.05 * this.resis; break;
            case ("lateral"): habilidade = 0.05 * this.impuls + 0.35 * this.vel + 0.15 * this.passe + 0.1 * this.remate +
                0.05 * this.cabec + 0.2 * this.destr + 0.1 * this.resis; break;
            default: return -1;
        }
        return habilidade;
    }
    
    //Setters
    
    public void setElast(int elast){
        if (elast > 100) elast = 100;
        else if (elast < 0) elast = 0;
        this.elast = elast;
    }
    
    public void setVelocidade(int vel){
        if (vel > 100) vel = 100;
        else if (vel < 0) vel = 0;
        this.vel = vel;
    }

    public void setResis(int resis){
        if (resis > 100) resis = 100;
        else if (resis < 0) resis = 0;
        this.resis = resis;
    }

    public void setDestr(int destr){
        if (destr > 100) destr = 100;
        else if (destr < 0) destr = 0;
        this.destr = destr;
    }

    public void setImpuls(int impuls){
        if (impuls > 100) impuls = 100;
        else if (impuls < 0) impuls = 0;
        this.impuls = impuls;
    }

    public void setCabec(int cabec){
        if (cabec > 100) cabec = 100;
        else if (cabec < 0) cabec = 0;
        this.cabec = cabec;
    }

    public void setRemate(int remate){
        if (remate > 100) remate = 100;
        else if (remate < 0) remate = 0;
        this.remate = remate;
    }

    public void setPasse(int passe){
        if (passe > 100) passe = 100;
        else if (passe < 0) passe = 0;
        this.passe = passe;
    }

    public void setNumero(int numero){
        if (numero > 99) numero = 99;
        else if (numero < 1) numero = 1;
        this.numero = numero;
    }

    public void setHistorico(ArrayList<String> historico){
        this.historico = historico;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean equals(Object o) {
        if (this==o) return true;
        if ((o==null) || (this.getClass()!=o.getClass())) return false;
        Jogador x= (Jogador) o ;
        return (this.vel == x.getVelocidade() && this.resis == x.getResis() && this.destr == x.getDestr() &&
        this.impuls == x.getImpuls() && this.cabec == x.getCabec() && this.remate == x.getRemate() && 
        this.passe == x.getPasse() && this.elast == x.getElast() && this.numero == x.getNumero() && 
        this.historico.equals(x.getHistorico()) && this.posicao.equals(x.getPosicao()) && 
        this.nome.equals(x.getNome()));
    }
}