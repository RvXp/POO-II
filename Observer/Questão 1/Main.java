public class Main {
    public static void main(String[] args) {
        CET cet = new CET();
        Prefeitura pref = new Prefeitura();
        cet.addObserver(pref);
        cet.setUmidade(50.0);
        cet.setTemperatura(30.0);

        Aeroporto aeroporto = new Aeroporto();
        cet.addObserver(aeroporto);
        cet.setVento(15.0);
        cet.removeObserver(aeroporto);
    }
}
