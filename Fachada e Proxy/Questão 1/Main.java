public class Main {
    public static void main(String[] args) {
        Amplificador amp = new Amplificador();
        Luzes luzes = new Luzes();
        Pipoqueira pipoqueira = new Pipoqueira();
        Projetor projetor = new Projetor();
        StreamingPlayer streamingPlayer = new StreamingPlayer();
        Telao telao = new Telao();

        HomeThreater homeThreater = new HomeThreater(amp, luzes, pipoqueira, projetor, streamingPlayer, telao);

        homeThreater.assistirFilme("Oppenheimer");
        homeThreater.fimDoFilme();
    }
}
