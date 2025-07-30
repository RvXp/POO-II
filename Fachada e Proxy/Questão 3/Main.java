package Fachada_Proxy.questão3;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new PagarProxy();
        pagamento.efetuarPagamento("Dinheiro", 1000.0);
        pagamento.efetuarPagamento("Debito", 100.0);
    }
}
