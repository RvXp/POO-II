package Strategy_Visitor.questão2;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new Item("Item 1", 15));
        carrinho.adicionarItem(new Item("Item 2", 10));

        PagamentoStrategy strategy = new PixPagamento();
        carrinho.realizaPagamento(strategy);
    }
}
