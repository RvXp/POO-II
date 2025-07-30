package Strategy_Visitor.questão3;

public class PrintVisitor implements Visitor {
    public void visit(Carro c){
        System.out.println("Cor do carro: " + c.getCor());
        System.out.println("Marca do carro: " + c.getCor());
        System.out.println("Modelo do carro: " + c.getCor());
    }
    public void visit(Onibus o){
        System.out.println("Quantidade de lugares no onibus: " + o.getQuantLugares());
        System.out.println("Ano de fabricacao do onibus: " + o.getAnoFabricacao());
    }
    public void visit(Bicicleta b){
        System.out.println("Cor da bicicleta: " + b.getCor());
    }
}
