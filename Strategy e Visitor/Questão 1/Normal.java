package Strategy_Visitor.questão1;

public class Normal implements FreteStrategy{
    public void pagarFrete(double frete){
        System.out.println("Pagando frete normal");
    }
}
