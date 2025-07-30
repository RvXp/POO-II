package Observer.questão2;

public class Investidor implements Observer{
    private double valorMaximoParaVender;
    private double valorParaCompra;
    private AcaoBroker acaoBroker;
    
    public Investidor(double min, double max, AcaoBroker acaoBroker){
        this.valorMaximoParaVender = max;
        this.valorParaCompra = min;
        this.acaoBroker = acaoBroker;
    }
    public void update(double valorDaAcao){
        if(valorDaAcao <= valorParaCompra){
            acaoBroker.comprar();
        }else if(valorDaAcao >= valorMaximoParaVender){
            acaoBroker.vender();
        }
    }
}
