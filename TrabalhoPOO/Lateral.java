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
    public Lateral()
    {
        super("Lateral");
        Random number = new Random();
        this.cruzamento = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
    }

    public int getCruzamento(){
        return this.cruzamento;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.2 * this.cruzamento + 0.05 * super.getImpulsao() + 0.25 * super.getVelocidade() + 0.1 * super.getPasse() +
                     0.05 * super.getRemate() + 0.05 * super.getCabeca() + 0.2 * super.getDestreza() + 0.1 * super.getResistencia();
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
