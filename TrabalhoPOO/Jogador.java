import java.util.ArrayList;
import java.util.Random;

public class Jogador{
    private int velocidade, resistencia, destreza, impulsao, cabeca, remate, passe, numero, elasticidade, forca, criatividade, finalizacao, cruzamento;
    private ArrayList<String> historico;
    private String posicao, nome;
    
    //Metodos construtores
    
    /**
     * Construtor sem argumentos. 
     * Cria um Jogador com atributos com um numero randomizado de 0 a 100, um numero randomizado de 1 a 99, um nome randomizado, uma posiçao randomizada e um historico vazio. 
     */
    public Jogador(){
        Random number = new Random();
        this.velocidade = number.nextInt(100);
        this.resistencia = number.nextInt(100);
        this.destreza = number.nextInt(100);
        this.impulsao = number.nextInt(100);
        this.cabeca = number.nextInt(100);
        this.remate = number.nextInt(100);
        this.passe = number.nextInt(100);
        this.elasticidade = number.nextInt(100);
        this.forca = number.nextInt(100);
        this.criatividade = number.nextInt(100);
        this.finalizacao = number.nextInt(100);
        this.cruzamento = number.nextInt(100);
        this.numero = number.nextInt(98)+1;
        this.historico = new ArrayList<String>();
        switch (number.nextInt(4)){
            case 0: this.posicao = "Guarda-redes"; break;
            case 1: this.posicao = "Defesa"; break;
            case 2: this.posicao = "Medio"; break;
            case 3: this.posicao = "Avancado"; break;
            case 4: this.posicao = "Lateral"; break;
        }
        this.nome = "Jogador " + number.nextInt(1000);
    }
  
    /**
     * Construtor com argumento (posiçao). 
     * Cria um Jogador com atributos com um numero randomizado de 0 a 100, um numero randomizado de 1 a 99, um nome randomizado, uma posiçao recebida e um historico vazio.
     * 
     * @param posiçao Posiçao a ser atribuida ao novo jogador.
     */
    public Jogador(String posicao){
        Random number = new Random();
        this.velocidade = number.nextInt(100);
        this.resistencia = number.nextInt(100);
        this.destreza = number.nextInt(100);
        this.impulsao = number.nextInt(100);
        this.cabeca = number.nextInt(100);
        this.remate = number.nextInt(100);
        this.passe = number.nextInt(100);
        this.elasticidade = number.nextInt(100);
        this.forca = number.nextInt(100);
        this.criatividade = number.nextInt(100);
        this.finalizacao = number.nextInt(100);
        this.cruzamento = number.nextInt(100);
        this.numero = number.nextInt(98)+1;
        this.historico = new ArrayList<String>();
        this.posicao = posicao;
        this.nome = "Jogador " + number.nextInt(1000);
    }    
    
    /**
     * Construtor com argumentos. 
     * Cria um Jogador com a informaçao recebida nos argumentos.
     * 
     * @param vel Velocidade a ser atribuida ao novo jogador.
     * @param resis Resistencia a ser atribuida ao novo jogador.
     * @param destr Destr a ser atribuida ao novo jogador.
     * @param impuls Impulsao a ser atribuida ao novo jogador.
     * @param cabec Cabeceamento a ser atribuido ao novo jogador.
     * @param remate Remate a ser atribuido ao novo jogador.
     * @param passe Passe a ser atribuido ao novo jogador.
     * @param elast Elasticidade a ser atribuida ao novo jogador (Guarda-redes).
     * @param numero Numero a ser atribuido ao novo jogador.
     * @param historico Historico a ser atribuido ao novo jogador.
     * @param posiçao Posiçao a ser atribuida ao novo jogador.
     * @param nome Nome a ser atribuido ao novo jogador.
     */
    public Jogador(int vel, int resis, int destr, int impuls, int cabec, int remate, int passe, int elast, int forca,
    int criat, int fin, int cruz,  int numero, ArrayList<String> historico, String posicao, String nome){
        this.velocidade = vel;
        this.resistencia = resis;
        this.destreza = destr;
        this.impulsao = impuls;
        this.cabeca = cabec;
        this.remate = remate;
        this.passe = passe;
        this.elasticidade = elast;
        this.forca = forca;
        this.criatividade = criat;
        this.finalizacao = fin;
        this.cruzamento = cruz;
        this.numero = numero;
        this.historico = historico;
        this.posicao = posicao;
        this.nome = nome;
    }
    
    /**
     * Construtor clone. 
     * Cria um Jogador igual ao jogador recebido.
     * 
     * @param jogador Jogador a ser copiado.
     */
    public Jogador(Jogador jogador){
        this.velocidade = jogador.getVelocidade();
        this.resistencia = jogador.getResistencia();
        this.destreza = jogador.getDestreza();
        this.impulsao = jogador.getImpulsao();
        this.cabeca = jogador.getCabeca();
        this.remate = jogador.getRemate();
        this.passe = jogador.getPasse();
        this.elasticidade = jogador.getElasticidade();
        this.forca = jogador.getForca();
        this.criatividade = jogador.getCriatividade();
        this.finalizacao = jogador.getFinalizacao();
        this.cruzamento = jogador.getCruzamento();
        this.numero = jogador.getNumero();
        this.historico = jogador.getHistorico();
        this.posicao = jogador.getPosicao();
        this.nome = jogador.getNomeJogador();
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
    
    public int getElasticidade(){
        return this.elasticidade;
    }

    public int getForca(){
        return this.forca;
    }
    
    public int getCriatividade(){
        return this.criatividade;
    }
    
    public int getFinalizacao(){
        return this.finalizacao;
    }
    
    public int getCruzamento(){
        return this.cruzamento;
    }
    
    public int getNumero(){
        return this.numero;
    }

    public ArrayList<String> getHistorico(){
        return this.historico;
    }

    public String getPosicao(){
        return this.posicao;
    }

    public String getNomeJogador(){
        return this.nome;
    }

    /**
     * Calcula a habilidade de um jogador, valor de 0 a 100. 
     * A importancia de cada habilidade varia de posiçao para posiçao, logo diferentes habilidades sao tidas mais em conta para calcular a habilidade de um jogador de uma certa posiçao.
     * 
     * @return habilidade Habilidade do jogador.
     */
    public double getHabilidadeJogador(){
        double habilidade = 0;
        switch (this.posicao){
            case ("Guarda-redes"): habilidade = 0.45 * this.elasticidade + 0.25 * this.impulsao + 0.05 * this.velocidade + 0.05 * this.passe +
                0.05 * this.remate + 0.05 * this.cabeca + 0.05 * this.destreza + 0.05 * this.resistencia; break;
            case ("Defesa"): habilidade = 0.25 * this.forca + 0.25 * this.impulsao + 0.05 * this.velocidade + 0.05 * this.passe + 0.05 * this.remate +
                0.25 * this.cabeca + 0.05 * this.destreza + 0.05 * this.resistencia; break;
            case ("Medio"): habilidade = 0.2 * this.criatividade + 0.05 * this.impulsao + 0.05 * this.velocidade + 0.25 * this.passe + 0.10 * this.remate +
                0.05 * this.cabeca + 0.2 * this.destreza + 0.1 * this.resistencia; break;
            case ("Avancado"): habilidade = 0.2 * this.finalizacao + 0.1 * this.impulsao + 0.1 * this.velocidade + 0.1 * this.passe + 0.2 * this.remate + 
                0.1 * this.cabeca + 0.15 * this.destreza + 0.05 * this.resistencia; break;
            case ("Lateral"): habilidade = 0.2 * this.cruzamento + 0.05 * this.impulsao + 0.25 * this.velocidade + 0.1 * this.passe + 0.05 * this.remate +
                0.05 * this.cabeca + 0.2 * this.destreza + 0.1 * this.resistencia; break;
            default: return -1;
        }
        return habilidade;
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
    
    public void setElasticidade(int elast){
        if (elast > 100)
            elast = 100;
        else if (elast < 0)
            elast = 0;
        this.elasticidade = elast;
    }

    public void setForca(int forca){
        if (forca > 100)
            forca = 100;
        else if (forca < 0)
            forca = 0;
        this.forca = forca;
    }
    
    public void setCriatividade(int criat){
        if (criat > 100)
            criat = 100;
        else if (criat < 0)
            criat = 0;
        this.criatividade = criat;
    }
    
    public void setFinalizacao(int fin){
        if (fin > 100)
            fin = 100;
        else if (fin < 0)
            fin = 0;
        this.finalizacao = fin;
    }
    
    public void setCruzamento(int cruz){
        if (cruz > 100)
            cruz = 100;
        else if (cruz < 0)
            cruz = 0;
        this.cruzamento = cruz;
    }
    
    public void setNumero(int numero){
        if (numero > 99)
            numero = 99;
        else if (numero < 1)
            numero = 1;
        this.numero = numero;
    }

    public void setHistorico(ArrayList<String> historico){
        this.historico = historico;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public void setNomeJogador(String nome){
        this.nome = nome;
    }

    /**
     * Indica se o jogador recebido e igual a este.
     * 
     * @param o Jogador a ser comparado.
     * @return True se forem iguais, False caso contrario.
     */
    public boolean equals(Object o){
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        Jogador x = (Jogador) o;
        return (this.velocidade == x.getVelocidade() && this.resistencia == x.getResistencia() && this.destreza == x.getDestreza() && this.impulsao == x.getImpulsao() 
               && this.cabeca == x.getCabeca() && this.remate == x.getRemate() && this.passe == x.getPasse() && this.elasticidade == x.getElasticidade()
               && this.forca == x.getForca() && this.criatividade == x.getCriatividade() && this.finalizacao == x.getFinalizacao() && this.cruzamento == x.getCruzamento()
               && this.numero == x.getNumero() && this.historico.equals(x.getHistorico()) && this.posicao.equals(x.getPosicao()) && this.nome.equals(x.getNomeJogador()));
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do jogador: ").append(getNomeJogador());
        sb.append("\nNumero: ").append(getNumero());
        sb.append("\nPosicao: ").append(getPosicao());
        sb.append("\nHabilidade: ").append(getHabilidadeJogador());
        sb.append("\nVelocidade: ").append(getVelocidade()).append(" | Resistencia: ").append(getResistencia()).append(" | Destreza: ").append(getDestreza()).
            append(" | Impulsao: ").append(getImpulsao()).append(" | Cabeceamento: ").append(getCabeca()).append(" | Remate: ").append(getRemate()).
            append(" | Passe: ").append(getPasse());
        switch (this.posicao){
            case ("Guarda-redes"): sb.append(" | Elasticidade: ").append(getElasticidade()); break;
            case ("Defesa"): sb.append(" | Forca: ").append(getForca()); break;
            case ("Medio"): sb.append(" | Criatividade: ").append(getCriatividade()); break;
            case ("Avancado"): sb.append(" | Finalizacao: ").append(getFinalizacao()); break;
            case ("Lateral"): sb.append(" | Cruzamento: ").append(getCruzamento()); break;
        }
        return sb.toString();
    }
}