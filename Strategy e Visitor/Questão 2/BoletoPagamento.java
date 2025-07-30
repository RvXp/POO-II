package Strategy_Visitor.questão2;

public class BoletoPagamento implements PagamentoStrategy {
    public void pagar(double valor){
        System.out.println("Pagando " + valor + " no boleto");
    }
}
