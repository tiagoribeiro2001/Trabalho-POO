import java.util.ArrayList;
import java.util.Random;
/**
 * Escreva a descrição da classe Equipa aqui.
 * 
 * @author (tropa) 
 * @version (segunda)
 */
public class Equipa{
    private ArrayList<Jogador> plantel,titular,suplentes;
    private String nomeEquipa;

    public Equipa() {
        this.plantel = new ArrayList<Jogador>();
        for (int i=0;i<3;i++){
            this.plantel.add(new Jogador("guarda-redes"));
        }
        for (int i=0;i<4;i++){
            this.plantel.add(new Jogador("lateral"));
        }
        for (int i=0;i<4;i++){
            this.plantel.add(new Jogador("defesa"));
        }
        for (int i=0;i<7;i++){
            this.plantel.add(new Jogador("medio"));
        }
        for (int i=0;i<7;i++){
            this.plantel.add(new Jogador("avançado"));
        }
        Random nome = new Random();
        this.nomeEquipa = "Equipa-" + nome.nextInt(1234);
        this.titular= criarTitular();
        this.suplentes=criarSuplentes();
    }
    
    public double getHabilidadeEquipa (){
        double habilidade= 0.0;
        for (int i=0;i<11;i++) {
            this.titular
            
        }
        
        
    }
    
    public ArrayList<Jogador> criarTitular (){       
    }

    public ArrayList<Jogador> criarSuplentes (){  
    }
    
    public void substituir(int entra,int sai){
    }
    
    public void transfere (Jogador jogador, Equipa equipa){
    }
    
    
    
    
}