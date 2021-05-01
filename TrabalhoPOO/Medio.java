import java.util.Random;

/**
 * Classe Medio
 *
 * @author Grupo 27
 */
public class Medio extends Jogador{
    private int criatividade;

    // Construtores
    
    public Medio(){
        super();
        Random number = new Random();
        this.criatividade = number.nextInt(100);
        setHabilidade(getHabilidadeJogador());
        setPosicao("Medio");
    }
    
    public Medio(String nome){
        super();
        Random number = new Random();
        this.criatividade = number.nextInt(100);
        setHabilidade(getHabilidadeJogador());
        setPosicao("Medio");
        setNomeJogador(nome);
    }
    
    public Medio(Medio md){
        super(md);
        this.criatividade = md.getCriatividade();
        setHabilidade(md.getHabilidadeJogador());
        setPosicao(md.getPosicao());
    }
    
    // Getters
    
    public int getCriatividade(){
        return this.criatividade;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.20 * this.criatividade 
                     + 0.05 * getEstatisticas().getImpulsao() 
                     + 0.05 * getEstatisticas().getVelocidade() 
                     + 0.25 * getEstatisticas().getPasse() 
                     + 0.10 * getEstatisticas().getRemate() 
                     + 0.05 * getEstatisticas().getCabeca() 
                     + 0.20 * getEstatisticas().getDestreza() 
                     + 0.10 * getEstatisticas().getResistencia();
        return (int) habilidade;
    }
    
    // Setters
    
    public void setCriatividade(int criat){
        if (criat > 100)
            criat = 100;
        else if (criat < 0)
            criat = 0;
        this.criatividade = criat;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" | Criatividade: ").append(getCriatividade()).append("\n---------------------------");
        return sb.toString();
    }
    
    public Medio clone(){
           return new Medio(this);
    }
}
