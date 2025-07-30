package Strategy_Visitor.questão2;

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
}
