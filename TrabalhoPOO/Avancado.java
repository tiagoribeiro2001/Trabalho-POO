import java.util.Random;

/**
 * Write a description of class Avancado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Avancado extends Jogador{
    private int finalizacao;

    /**
     * Constructor for objects of class Avancado
     */
    public Avancado(){
        super();
        Random number = new Random();
        this.finalizacao = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
        super.setPosicao("Avancado");
    }
    
    public Avancado(String nome){
        super();
        Random number = new Random();
        this.finalizacao = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
        super.setPosicao("Avancado");
        super.setNomeJogador(nome);
    }
    
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
}
