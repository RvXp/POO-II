package Templete.questão2;

import java.util.ArrayList;

public class Loja extends Templete{
    private String entrega;
    private String formaDePagamento;
    private ArrayList<String> formasDePagamento;
    private ArrayList<Compra> carrinho;

    public Loja(){
        formasDePagamento = new ArrayList<String>();
        carrinho = new ArrayList<Compra>();
        formasDePagamento.add("Online");
        formasDePagamento.add("Na loja");
        formasDePagamento.add("Criptomoedas");
    }
    @Override
    public void formaDePagamento(){
        if(formasDePagamento.contains(formaDePagamento)){
            double total = 0.0;
            for(Compra c: carrinho){
                total += c.getPreco() * c.getQuantidade();
            }
            System.out.println("Preco total: " +  total);
            pagamentoEfetivado(formaDePagamento);
        }else{
            System.out.println("Forma de pagamento invalida!");
        }
    }
    @Override
    public void entrega(){
        if(entrega == "Sim"){
            paraEntrega();
        }else{
            System.out.println("Item deve ser retirado na loja");
        }
    }
    @Override
    public void adicionarAoCarrinho(Compra produto){
        carrinho.add(produto);
    }
    public void setEntrega(String entrega) {
        this.entrega = entrega;
        entrega();
    }
    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
        formaDePagamento();
    }
}
