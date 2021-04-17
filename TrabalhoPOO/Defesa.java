import java.util.Random;

/**
 * Write a description of class Defesa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Defesa extends Jogador{
    private int forca;

    /**
     * Constructor for objects of class Defesa
     */
    public Defesa(){
        super("Defesa");
        Random number = new Random();
        this.forca = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
    }
    
    public int getForca(){
        return this.forca;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.25 * this.forca + 0.25 * super.getImpulsao() + 0.05 * super.getVelocidade() + 0.05 * super.getPasse() +
                     0.05 * super.getRemate() + 0.25 * super.getCabeca() + 0.05 * super.getDestreza() + 0.05 * super.getResistencia();
        return (int) habilidade;
    }
    
    public void setForca(int forca){
        if (forca > 100)
            forca = 100;
        else if (forca < 0)
            forca = 0;
        this.forca = forca;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" | Forca: ").append(getForca()).append("\n---------------------------");
        return sb.toString();
    }
}
