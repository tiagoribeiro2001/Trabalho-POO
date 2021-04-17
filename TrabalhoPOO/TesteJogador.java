public class TesteJogador{
    public static void main(String[] args){
        Jogador joga1 = new Guarda_redes();
        Jogador joga2 = new Defesa();
        Jogador joga3 = new Medio();
        Jogador joga4 = new Avancado();
        Jogador joga5 = new Lateral();
        System.out.println(joga1.toString());
        System.out.println(joga2.toString());
        System.out.println(joga3.toString());
        System.out.println(joga4.toString());
        System.out.println(joga5.toString());
    }
}
