package Strategy_Visitor.questão1;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> itens = new ArrayList<>();
    
    public void adicionarItem(Item item){
        itens.add(item);
    }
    public void remover(Item item){
        itens.remove(item);
    }

    public double total(){
        int tot = 0;
        for(Item i: itens){
            tot += i.getValor();
        }
        return tot;
    }

    public void realizaPagamento(PagamentoStrategy strategy){
        double total = this.total();
        strategy.pagar(total);
    }   

    public void calculaFrete(String regiao, FreteStrategy fret){
        double frete = 0;
        if(regiao == "Sudeste" || regiao == "Nordeste"){
            frete =  10 + total()*0.1;
        }else if(regiao == "Norte" || regiao == "Centro"){
            frete = 10 + total()*0.15;
        }else if(regiao == "Sul" || regiao == "Centro Oeste"){
            frete = 10 + total()*0.2;
        }else{
            System.out.println("Região invalida");
        }
        fret.pagarFrete(frete);
    }

}
