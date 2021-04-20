public class TesteJogador{
    public static void main(String[] args){
        Jogador joga1 = new Guarda_redes("Joao Vitor");
        Jogador joga2 = new Defesa("Ruben Dias");
        Jogador joga3 = new Medio("Tiago Ribeiro");
        Jogador joga4 = new Avancado("Chico New");
        Jogador joga5 = new Lateral("Joao Cancelo");
        System.out.println(joga1.toString());
        System.out.println(joga2.toString());
        System.out.println(joga3.toString());
        System.out.println(joga4.toString());
        System.out.println(joga5.toString());
    }
}
