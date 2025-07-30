package Strategy_Visitor.questão1;

public class CartaoPagamento  implements PagamentoStrategy{
    
    public void pagar(double valor){
        System.out.println("Pagando " + valor + " no cartão");
    }
}   
