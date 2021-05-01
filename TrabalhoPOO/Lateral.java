import java.util.Random;
    
/**
 * Classe Lateral
 *
 * @author Grupo 27
 */
public class Lateral extends Jogador{
    private int cruzamento;
    
    // Construtores
    
    public Lateral(){
        super();
        Random number = new Random();
        this.cruzamento = number.nextInt(100);
        setHabilidade(getHabilidadeJogador());
        setPosicao("Lateral");
    }
    
    public Lateral(String nome){
        super();
        Random number = new Random();
        this.cruzamento = number.nextInt(100);
        setHabilidade(getHabilidadeJogador());
        setPosicao("Lateral");
        setNomeJogador(nome);
    }
    
    public Lateral(Lateral lt){
        super(lt);
        this.cruzamento = lt.getCruzamento();
        setHabilidade(lt.getHabilidadeJogador());
        setPosicao(lt.getPosicao());
    }
    
    // Getters
    
    public int getCruzamento(){
        return this.cruzamento;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.2 * this.cruzamento 
                     + 0.05 * getEstatisticas().getImpulsao() 
                     + 0.25 * getEstatisticas().getVelocidade() 
                     + 0.10 * getEstatisticas().getPasse() 
                     + 0.05 * getEstatisticas().getRemate() 
                     + 0.05 * getEstatisticas().getCabeca() 
                     + 0.20 * getEstatisticas().getDestreza() 
                     + 0.10 * getEstatisticas().getResistencia();
        return (int) habilidade;
    }
    
    // Setters
    
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
    
    public Lateral clone(){
           return new Lateral(this);
    }
}
