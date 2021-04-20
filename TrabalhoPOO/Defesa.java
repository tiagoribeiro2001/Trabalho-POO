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
        super();
        Random number = new Random();
        this.forca = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
        super.setPosicao("Defesa");
    }
    
    public Defesa(String nome){
        super();
        Random number = new Random();
        this.forca = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
        super.setPosicao("Defesa");
        super.setNomeJogador(nome);
    }
    
    public int getForca(){
        return this.forca;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.25 * this.forca + 0.25 * super.getEstatisticas().getImpulsao() + 0.05 * super.getEstatisticas().getVelocidade() +
                     0.05 * super.getEstatisticas().getPasse() + 0.05 * super.getEstatisticas().getRemate() + 0.25 * super.getEstatisticas().getCabeca() +
                     0.05 * super.getEstatisticas().getDestreza() + 0.05 * super.getEstatisticas().getResistencia();
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
