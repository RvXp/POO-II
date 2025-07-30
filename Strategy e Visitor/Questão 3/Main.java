package Strategy_Visitor.questão3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> list = new ArrayList<>();
        list.add(new Carro("Rosa", "Chevrolet", "Camaro"));
        list.add(new Onibus(40, 2010));
        list.add(new Bicicleta("Verde"));
        PrintVisitor visitor = new PrintVisitor();
        for(Veiculo v: list){
            v.accept(visitor);
        }

        MensagemVisitor visit = new MensagemVisitor();
        for(Veiculo v: list){
            v.accept(visit);
        }
    }
}
