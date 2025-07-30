package Templete.questão2;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.adicionarAoCarrinho(new Compra(10, 5));
        loja.adicionarAoCarrinho(new Compra(25, 2));
        loja.setFormaDePagamento("Na loja");
        loja.setEntrega("Não");

        Loja loja2 = new Loja();
        loja2.adicionarAoCarrinho(new Compra(40, 6));
        loja.setEntrega("Sim");
        loja2.setFormaDePagamento("Debito");

    }

}
