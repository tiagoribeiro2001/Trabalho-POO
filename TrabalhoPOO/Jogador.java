import java.util.ArrayList;

public class Jogador
{
    private int vel,resis,destr,impuls,cabec,remate,passe,numero;
    private ArrayList<String> historico;
    private String posicao,nome;
    
    public Jogador(){
        this.vel = 0;
        this.resis=0;
        this.destr=0;
        this.impuls=0;
        this.cabec=0;
        this.remate=0;
        this.passe=0;
        this.numero=0;
        this.historico = new ArrayList<String>();
        this.posicao = "";
        this.nome = "";
    }
    
    
    public Jogador(int vel,int resis,int destr,int impuls,int cabec,int remate,int passe, int numero,ArrayList<String> historico,String posicao,String nome){
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

}
