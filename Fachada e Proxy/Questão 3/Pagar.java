package Fachada_Proxy.questão3;

public class Pagar implements Pagamento{
    public void efetuarPagamento(String forma, double valor) {
        System.out.println("Pagando com " + forma + " o valor de: " + valor);
    }
}
