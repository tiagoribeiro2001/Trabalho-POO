import java.util.Random;

/**
 * Classe Avancado
 *
 * @author Grupo 27
 */
public class Avancado extends Jogador{
    private int finalizacao;

    // Construtores
    
    public Avancado(){
        super();
        Random number = new Random();
        this.finalizacao = number.nextInt(100);
        setHabilidade(getHabilidadeJogador());
        setPosicao("Avancado");
    }
    
    public Avancado(String nome){
        super();
        Random number = new Random();
        this.finalizacao = number.nextInt(100);
        setHabilidade(getHabilidadeJogador());
        setPosicao("Avancado");
        setNomeJogador(nome);
    }
    
    public Avancado(Avancado av){
        super(av);
        this.finalizacao = av.getFinalizacao();
        setHabilidade(av.getHabilidadeJogador());
        setPosicao(av.getPosicao());
    }
    
    // Getters
    
    public int getFinalizacao(){
        return this.finalizacao;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.2 * this.finalizacao + 0.1 * super.getEstatisticas().getImpulsao() + 0.1 * super.getEstatisticas().getVelocidade() +
                     0.1 * super.getEstatisticas().getPasse() + 0.2 * super.getEstatisticas().getRemate() + 0.1 * super.getEstatisticas().getCabeca() +
                     0.15 * super.getEstatisticas().getDestreza() + 0.05 * super.getEstatisticas().getResistencia();
        return (int) habilidade;
    }
    
    // Setters
    
    public void setFinalizacao(int fin){
        if (fin > 100)
            fin = 100;
        else if (fin < 0)
            fin = 0;
        this.finalizacao = fin;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" | Finalizacao: ").append(getFinalizacao()).append("\n---------------------------");
        return sb.toString();
    }
    
    public Avancado clone(){
           return new Avancado(this);
    }
}
