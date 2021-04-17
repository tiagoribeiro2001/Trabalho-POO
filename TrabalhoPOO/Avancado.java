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
        super("Avancado");
        Random number = new Random();
        this.finalizacao = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
    }
    
    public int getFinalizacao(){
        return this.finalizacao;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.2 * this.finalizacao + 0.1 * super.getImpulsao() + 0.1 * super.getVelocidade() + 0.1 * super.getPasse() +
                     0.2 * super.getRemate() + 0.1 * super.getCabeca() + 0.15 * super.getDestreza() + 0.05 * super.getResistencia();
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
