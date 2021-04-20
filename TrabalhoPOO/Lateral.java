import java.util.Random;
    
/**
 * Write a description of class Lateral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lateral extends Jogador{
    private int cruzamento;
    
    /**
     * Constructor for objects of class Lateral
     */
    public Lateral(){
        super();
        Random number = new Random();
        this.cruzamento = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
        super.setPosicao("Lateral");
    }
    
    public Lateral(String nome){
        super();
        Random number = new Random();
        this.cruzamento = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
        super.setPosicao("Lateral");
        super.setNomeJogador(nome);
    }
    
    public int getCruzamento(){
        return this.cruzamento;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.2 * this.cruzamento + 0.05 * super.getEstatisticas().getImpulsao() + 0.25 * super.getEstatisticas().getVelocidade() +
                     0.1 * super.getEstatisticas().getPasse() + 0.05 * super.getEstatisticas().getRemate() + 0.05 * super.getEstatisticas().getCabeca() +
                     0.2 * super.getEstatisticas().getDestreza() + 0.1 * super.getEstatisticas().getResistencia();
        return (int) habilidade;
    }
    
    public void setCruzamento(int cruz){
        if (cruz > 100)
            cruz = 100;
        else if (cruz < 0)
            cruz = 0;
        this.cruzamento = cruz;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" | Cruzamento: ").append(getCruzamento()).append("\n---------------------------");
        return sb.toString();
    }
}
