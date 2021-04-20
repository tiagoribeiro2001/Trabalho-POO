import java.util.Random;

/**
 * Write a description of class Medio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Medio extends Jogador{
    private int criatividade;

    /**
     * Constructor for objects of class Medio
     */
    public Medio(){
        super();
        Random number = new Random();
        this.criatividade = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
        super.setPosicao("Medio");
    }
    
    public Medio(String nome){
        super();
        Random number = new Random();
        this.criatividade = number.nextInt(100);
        super.setHabilidade(getHabilidadeJogador());
        super.setPosicao("Medio");
        super.setNomeJogador(nome);
    }
    
    public int getCriatividade(){
        return this.criatividade;
    }
    
    public int getHabilidadeJogador(){
        double habilidade = 0;
        habilidade = 0.2 * this.criatividade + 0.05 * super.getEstatisticas().getImpulsao() + 0.05 * super.getEstatisticas().getVelocidade() +
                     0.25 * super.getEstatisticas().getPasse() + 0.10 * super.getEstatisticas().getRemate() + 0.05 * super.getEstatisticas().getCabeca() +
                     0.2 * super.getEstatisticas().getDestreza() + 0.1 * super.getEstatisticas().getResistencia();
        return (int) habilidade;
    }
    
    public void setCriatividade(int criat){
        if (criat > 100)
            criat = 100;
        else if (criat < 0)
            criat = 0;
        this.criatividade = criat;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" | Criatividade: ").append(getCriatividade()).append("\n---------------------------");
        return sb.toString();
    }
}
