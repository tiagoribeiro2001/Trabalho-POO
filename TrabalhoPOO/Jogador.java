import java.util.ArrayList;
import java.util.Random;

public class Jogador
{
    private int vel,resis,destr,impuls,cabec,remate,passe,numero,elast;
    private ArrayList<String> historico;
    private String posicao,nome;
    
    public Jogador(){
        Random number = new Random();
        this.vel = number.nextInt(100);
        this.resis= number.nextInt(100);
        this.destr=number.nextInt(100);
        this.impuls=number.nextInt(100);
        this.cabec=number.nextInt(100);
        this.remate=number.nextInt(100);
        this.passe=number.nextInt(100);
        this.numero=number.nextInt(100);
        this.elast=number.nextInt(100);
        this.historico = new ArrayList<String>();
        this.posicao = "";
        this.nome = "";
    }
  
    
    public Jogador(String posicao){
        Random number = new Random();
        this.vel = number.nextInt(100);
        this.resis= number.nextInt(100);
        this.destr=number.nextInt(100);
        this.impuls=number.nextInt(100);
        this.cabec=number.nextInt(100);
        this.remate=number.nextInt(100);
        this.passe=number.nextInt(100);
        this.numero=number.nextInt(100);
        this.elast=number.nextInt(100);
        this.historico = new ArrayList<String>();
        this.posicao = posicao;
        this.nome = "";
    }    
    
    
    public Jogador(int vel,int resis,int destr,int impuls,int cabec,int remate,int passe, int numero,int elast,ArrayList<String> historico,String posicao,String nome){
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
    
    
    public Jogador(Jogador jogador) {
        this.vel=jogador.getVelocidade();
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

    public int getVelocidade() {
        return this.vel;
    }

    public int getResis() {
        return this.resis;
    }

    public int getDestr() {
        return this.destr;
    }

    public int getImpuls() {
        return this.impuls;
    }

    public int getCabec() {
        return this.cabec;
    }

    public int getRemate() {
        return this.remate;
    }

    public int getPasse() {
        return this.passe;
    }

    public int getNumero() {
        return this.numero;
    }

    public ArrayList<String> getHistorico() {
        return this.historico;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public String getNome() {
        return this.nome;
    }
    
    public int getElast(){
        return this.elast;
    }

    public void setElast(int elast){
        this.elast=elast;
    }
    public void setVelocidade(int vel) {
        this.vel=vel;
    }

    public void setResis(int resis) {
        this.resis=resis;
    }

    public void setDestr(int destr) {
        this.destr= destr;
    }

    public void setImpuls(int impuls) {
        this.impuls=impuls;
    }

    public void setCabec(int cabec) {
        this.cabec=cabec;
    }

    public void setRemate(int remate) {
        this.remate=remate;
    }

    public void setPasse(int passe) {
        this.passe=passe;
    }

    public void setNumero(int numero) {
        this.numero=numero;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }

    public void setPosicao(String posicao) {
        this.posicao=posicao;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }
    public double getHabilidadeJogador() {
        double habilidade=0.0;
        if (this.posicao=="guarda-redes") {
            habilidade = 0.45 * this.elast + 0.3 * this.impuls + 0.05 * this.vel + 0.05 * this.passe +
            0.05 * this.remate + 0.05 * this.cabec + 0.05 * this.destr;
        }
        else if (this.posicao=="defesa") {
            habilidade = 0.35 * this.impuls + 0.1 * this.vel + 0.1 * this.passe + 0.05 * this.remate +
            0.35 * this.cabec + 0.05 * this.destr;
        }
        else if (this.posicao=="medio") {
            habilidade = 0.05 * this.impuls + 0.1 * this.vel + 0.35 * this.passe + 0.15 * this.remate +
            0.05 * this.cabec + 0.3 * this.destr;
        }
        else if (this.posicao=="avançado") {
            habilidade = 0.1 * this.impuls + 0.15 * this.vel + 0.1 * this.passe + 0.3 * this.remate + 
            0.15 * this.cabec + 0.2 * this.destr;
        }
        else if (this.posicao=="lateral") {
            habilidade = 0.05 * this.impuls + 0.4 * this.vel + 0.2 * this.passe + 0.1 * this.remate +
            0.05 * this.cabec + 0.2 * this.destr;
        }
        else return -1;
        return habilidade;
    }
}
