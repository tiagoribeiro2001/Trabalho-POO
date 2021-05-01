import java.util.Random;

/**
 * Classe Defesa
 *
 * @author Grupo 27
 */
public class Defesa extends Jogador{
    private int forca;

    // Construtores
    
    public Defesa(){
        super();
        Random number = new Random();
        this.forca = number.nextInt(100);
        setHabilidade(getHabilidadeJogador());
        setPosicao("Defesa");
    }
    
    public Defesa(String nome){
        super();
        Random number = new Random();
        this.forca = number.nextInt(100);
        setHabilidade(getHabilidadeJogador());
        setPosicao("Defesa");
        setNomeJogador(nome);
    }
    
    public Defesa(Defesa df){
        super(df);
        this.forca = df.getForca();
        setHabilidade(df.getHabilidadeJogador());
        setPosicao(df.getPosicao());
    }
    
    // Getters
    
    public int getForca(){
        return this.forca;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.25 * this.forca 
                     + 0.25 * getEstatisticas().getImpulsao() 
                     + 0.05 * getEstatisticas().getVelocidade() 
                     + 0.05 * getEstatisticas().getPasse() 
                     + 0.05 * getEstatisticas().getRemate() 
                     + 0.25 * getEstatisticas().getCabeca() 
                     + 0.05 * getEstatisticas().getDestreza() 
                     + 0.05 * getEstatisticas().getResistencia();
        return (int) habilidade;
    }
    
    // Setters
    
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
    
    public Defesa clone(){
           return new Defesa(this);
    }
}
