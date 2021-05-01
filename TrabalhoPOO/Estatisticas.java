import java.util.Random;

/**
 * Classe Estatisticas
 *
 * @author Grupo 27
 */
public class Estatisticas
{
    private int velocidade, resistencia, destreza, impulsao, cabeca, remate, passe;

    // Construtores
    
    public Estatisticas(){
        Random number = new Random();
        this.velocidade = number.nextInt(100);
        this.resistencia = number.nextInt(100);
        this.destreza = number.nextInt(100);
        this.impulsao = number.nextInt(100);
        this.cabeca = number.nextInt(100);
        this.remate = number.nextInt(100);
        this.passe = number.nextInt(100);
    }
    
    public Estatisticas(int vel, int res, int des, int imp, int cab, int rem, int pas){
        this.velocidade = vel;
        this.resistencia = res;
        this.destreza = des;
        this.impulsao = imp;
        this.cabeca = cab;
        this.remate = rem;
        this.passe = pas;
    }
    
    public Estatisticas(Estatisticas stats){
        this.velocidade = stats.getVelocidade();
        this.resistencia = stats.getResistencia();
        this.destreza = stats.getDestreza();
        this.impulsao = stats.getImpulsao();
        this.cabeca = stats.getCabeca();
        this.remate = stats.getRemate();
        this.passe = stats.getPasse();
    }

    //Getters
    
    public int getVelocidade(){
        return this.velocidade;
     }

    public int getResistencia(){
        return this.resistencia;
    }

    public int getDestreza(){
        return this.destreza;
    }

    public int getImpulsao(){
        return this.impulsao;
    }

    public int getCabeca(){
        return this.cabeca;
    }

    public int getRemate(){
        return this.remate;
    }

    public int getPasse(){
        return this.passe;
    }
    
    //Setters
    
    public void setVelocidade(int vel){
        if (vel > 100) 
            vel = 100;
        else if (vel < 0) 
            vel = 0;
        this.velocidade = vel;
    }

    public void setResistencia(int resis){
        if (resis > 100) 
            resis = 100;
        else if (resis < 0) 
            resis = 0;
        this.resistencia = resis;
    }

    public void setDestreza(int destr){
        if (destr > 100) 
            destr = 100;
        else if (destr < 0) 
            destr = 0;
        this.destreza = destr;
    }

    public void setImpulsao(int impuls){
        if (impuls > 100)
            impuls = 100;
        else if (impuls < 0)
            impuls = 0;
        this.impulsao = impuls;
    }

    public void setCabeca(int cabec){
        if (cabec > 100)
            cabec = 100;
        else if (cabec < 0)
            cabec = 0;
        this.cabeca = cabec;
    }

    public void setRemate(int remate){
        if (remate > 100)
            remate = 100;
        else if (remate < 0)
            remate = 0;
        this.remate = remate;
    }

    public void setPasse(int passe){
        if (passe > 100)
            passe = 100;
        else if (passe < 0)
            passe = 0;
        this.passe = passe;
    }
    
    //Metodos
    
    public boolean equals(Object o){
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        Estatisticas x = (Estatisticas) o;
        return (this.velocidade == x.getVelocidade() && this.resistencia == x.getResistencia() && this.destreza == x.getDestreza() && this.impulsao == x.getImpulsao() 
               && this.cabeca == x.getCabeca() && this.remate == x.getRemate() && this.passe == x.getPasse());
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Velocidade: ").append(getVelocidade()).append(" | Resistencia: ").append(getResistencia()).append(" | Destreza: ").append(getDestreza()).
            append(" | Impulsao: ").append(getImpulsao()).append(" | Cabeceamento: ").append(getCabeca()).append(" | Remate: ").append(getRemate()).
            append(" | Passe: ").append(getPasse());
        return sb.toString();
    }
    
    public Estatisticas clone(){
        return new Estatisticas(this);   
    }
}
