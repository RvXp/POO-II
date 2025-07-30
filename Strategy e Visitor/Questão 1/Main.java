package Strategy_Visitor.questão1;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new Item("Item 1", 15));
        carrinho.adicionarItem(new Item("Item 2", 10));
        FreteStrategy frete = new Sedex();
        carrinho.calculaFrete("Sudeste", frete);
        PagamentoStrategy strategy = new PixPagamento();
        carrinho.realizaPagamento(strategy);
    }
}
