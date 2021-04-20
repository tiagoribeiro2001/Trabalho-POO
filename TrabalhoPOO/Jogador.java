import java.util.ArrayList;
import java.util.Random;

public abstract class Jogador{
    private Estatisticas estatisticas;
    private int numero, habilidade;
    private ArrayList<String> historico;
    private String posicao, nome;
    
    //Metodos construtores
    
    /**
     * Construtor sem argumentos. 
     * Cria um Jogador com atributos com um numero randomizado de 0 a 100, um numero randomizado de 1 a 99, um nome randomizado, uma posiçao randomizada e um historico vazio. 
     */
    public Jogador(){
        Random number = new Random();
        this.numero = number.nextInt(98)+1;
        this.historico = new ArrayList<String>();
        this.estatisticas = new Estatisticas();
        this.nome = "Jogador " + number.nextInt(1000);
    }
     
    
    /**
     * Construtor com argumentos. 
     * Cria um Jogador com a informaçao recebida nos argumentos.
     * 
     * @param stats Estatisticas do jogador
     * @param numero Numero a ser atribuido ao novo jogador.
     * @param historico Historico a ser atribuido ao novo jogador.
     * @param posiçao Posiçao a ser atribuida ao novo jogador.
     * @param nome Nome a ser atribuido ao novo jogador.
     */
    public Jogador(Estatisticas stats, int numero, ArrayList<String> historico, String posicao, String nome){
        this.estatisticas = stats;
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
        this.estatisticas = jogador.getEstatisticas();
        this.habilidade = jogador.getHabilidade();
        this.numero = jogador.getNumero();
        this.historico = jogador.getHistorico();
        this.posicao = jogador.getPosicao();
        this.nome = jogador.getNomeJogador();
    }

    //Getters
    
    public Estatisticas getEstatisticas(){
        return this.estatisticas;
    }
    
    public int getHabilidade(){
        return this.habilidade;
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
    
    //Setters
    
    public void setEstatisticas(Estatisticas stats){
        this.estatisticas = stats;
    }
    
    public void setHabilidade(int habil){
        if (habil > 100)
            habil = 100;
        else if (habil < 0)
            habil = 0;
        this.habilidade = habil;
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
        return (this.estatisticas.equals(x.getEstatisticas()) && this.habilidade == x.getHabilidade() && this.numero == x.getNumero() 
               && this.historico.equals(x.getHistorico()) && this.posicao.equals(x.getPosicao()) && this.nome.equals(x.getNomeJogador()));
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do jogador: ").append(getNomeJogador());
        sb.append("\nNumero: ").append(getNumero());
        sb.append("\nPosicao: ").append(getPosicao());
        sb.append("\nHabilidade: ").append(getHabilidade()).append("\n");
        sb.append(estatisticas.toString());
        return sb.toString();
    }
}