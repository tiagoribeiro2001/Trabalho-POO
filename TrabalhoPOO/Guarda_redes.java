import java.util.Random;

/**
 * Classe Guarda_redes
 *
 * @author Grupo 27
 */
public class Guarda_redes extends Jogador{
    private int elasticidade;
    
    // Construtores
    
    public Guarda_redes(){
        super();
        Random number = new Random();
        this.elasticidade = number.nextInt(100);
        setHabilidade(getHabilidadeJogador());
        setPosicao("Guarda-redes");
    }
    
    public Guarda_redes(String nome){
        super();
        Random number = new Random();
        this.elasticidade = number.nextInt(100);
        setHabilidade(getHabilidadeJogador());
        setPosicao("Guarda-redes");
        setNomeJogador(nome);
    }
    
    public Guarda_redes(Guarda_redes gr){
        super(gr);
        this.elasticidade = gr.getElasticidade();
        setHabilidade(gr.getHabilidadeJogador());
        setPosicao(gr.getPosicao());
    }
    
    // Getters
    
    public int getElasticidade(){
        return this.elasticidade;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.45 * this.elasticidade 
                     + 0.25 * getEstatisticas().getImpulsao() 
                     + 0.05 * getEstatisticas().getVelocidade() 
                     + 0.05 * getEstatisticas().getPasse() 
                     + 0.05 * getEstatisticas().getRemate() 
                     + 0.05 * getEstatisticas().getCabeca() 
                     + 0.05 * getEstatisticas().getDestreza() 
                     + 0.05 * getEstatisticas().getResistencia();
        return (int) habilidade;
    }
    
    // Setters
    
    public void setElasticidade(int elast){
        if (elast > 100)
            elast = 100;
        else if (elast < 0)
            elast = 0;
        this.elasticidade = elast;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" | Elasticidade: ").append(getElasticidade()).append("\n---------------------------");
        return sb.toString();
    }
    
    public Guarda_redes clone(){
           return new Guarda_redes(this);
    }
}
