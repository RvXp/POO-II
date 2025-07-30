package Fachada_Proxy.questão3;

import java.util.ArrayList;
import java.util.List;

public class PagarProxy implements Pagamento{
    private Pagamento pagamento;
    private List<String> formasAceitas;

    public PagarProxy(){
        this.pagamento = new Pagar();
        this.formasAceitas = new ArrayList<>();
        this.formasAceitas.add("Dinheiro");
        this.formasAceitas.add("Credito");
        this.formasAceitas.add("PIX");
    }
    public void efetuarPagamento(String forma, double valor){
        if(formasAceitas.contains(forma)){
            pagamento.efetuarPagamento(forma, valor);
        }else{
            System.out.println("Forma de pagamento " + forma +  " não aceita");
        }
    }
}
