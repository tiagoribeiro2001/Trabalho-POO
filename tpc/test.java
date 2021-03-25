import java.time.LocalDate;
/**
 * Classe de teste encomenda da ficha 4 exercicio 2) B)
 * 
 * @author Vitor
 * @version 24032021
 */
public class test {
    public static void main(String[] args){
        LinhaEncomenda l1 = new LinhaEncomenda("Computador", "Ajuda a programar"   , 450, 3, 0.23, 0.2);
        LinhaEncomenda l2 = new LinhaEncomenda("Rato Gaming" , "Ajudam na acessiblidade do computador", 30 , 4, 0.23, 0.30);
        Encomenda encs = new Encomenda("João Vitor", 123, "Morada", 6969, l1);
        encs.adicionaLinha(l2);
        System.out.println(encs.toString());
        System.out.println("Preço total: " + encs.calculaValorTotal());
        System.out.println("Poupas: " + encs.calculaValorDesconto());
        System.out.println("Total de produtos: " + encs.numeroTotalProdutos());
        System.out.println("Vou comprar um computador: " + encs.existeProdutoEncomenda("computador"));
        encs.removeProduto("Rato Gaming");
        System.out.println("\nQueria um computador e um rato \n" + encs.toString());
    }

}
