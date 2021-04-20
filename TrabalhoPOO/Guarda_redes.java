import java.util.Random;

/**
 * Write a description of class Guarda_redes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Guarda_redes extends Jogador{
    private int elasticidade;
    
    /**
     * Constructor for objects of class Guarda_redes
     */
    public Guarda_redes(){
        super();
        Random number = new Random();
        this.elasticidade = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
        super.setPosicao("Guarda-redes");
    }
    
    public Guarda_redes(String nome){
        super();
        Random number = new Random();
        this.elasticidade = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
        super.setPosicao("Guarda-redes");
        super.setNomeJogador(nome);
    }
    
    public int getElasticidade(){
        return this.elasticidade;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.45 * this.elasticidade + 0.25 * super.getEstatisticas().getImpulsao() + 0.05 * super.getEstatisticas().getVelocidade() +
                     0.05 * super.getEstatisticas().getPasse() + 0.05 * super.getEstatisticas().getRemate() + 0.05 * super.getEstatisticas().getCabeca() +
                     0.05 * super.getEstatisticas().getDestreza() + 0.05 * super.getEstatisticas().getResistencia();
        return (int) habilidade;
    }
    
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
}
