
public class LinhaEncomenda {
    private String referencia;
    private String descricao;
    private double preco;
    private int quantidade;
    private double imposto;
    private double desconto;
    
public String getReferencia() {
    return this.referencia;
    }
public String getDescricao() {
    return this.descricao;
    }
public double getpreco() {
    return this.preco;
    }
public int getQuantidade() {
    return this.quantidade;
    }
public double getImposto() {
    return this.imposto;
    }
public double getDesconto() {
    return this.desconto;
}
public void setReferencia(String referencia) {
    this.referencia=referencia;
}
public void setDescricao(String descricao) {
    this.descricao=descricao;
}
public void setQuantidade(int quantidade) {
    this.quantidade=quantidade;
}
public void setPreco(Double Preco) {
    this.preco=preco;
}
public void setImposto(Double imposto) {
    this.imposto=imposto;
}
public void setDesconto(Double desconto) {
    this.desconto=desconto;
}
public double calculaValorTotal(){
    return (this.preco * this.quantidade * (1 + this.imposto) * desconto);
}

}