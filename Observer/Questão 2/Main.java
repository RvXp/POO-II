package Observer.questão2;

public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao();
        Investidor investidor = new Investidor(100.0, 10000.0, new AcaoBroker());
        acao.addObserver(investidor);
        acao.setAcao(10.0);
        acao.setAcao(50000.0);
        acao.setAcao(90.0);
    }
}
