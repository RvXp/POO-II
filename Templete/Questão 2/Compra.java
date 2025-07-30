package Templete.questão2;

public class Compra {
    private int quantidade;
    private double preco;

    public Compra(int quantidade, double preco){
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
