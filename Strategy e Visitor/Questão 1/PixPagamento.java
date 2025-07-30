package Strategy_Visitor.questão1;

public class PixPagamento implements PagamentoStrategy{
    public void pagar(double valor){
        System.out.println("Pagando " + valor + " no PIX");
    }
}
