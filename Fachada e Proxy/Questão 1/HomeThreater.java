
public class HomeThreater {
    Amplificador amp;
    Luzes luzes;
    Pipoqueira pipoqueira;
    Projetor projetor;
    StreamingPlayer streamingPlayer;
    Telao telao;
    public HomeThreater(Amplificador amp, Luzes luzes, Pipoqueira pipoqueira, Projetor projetor, StreamingPlayer streamingPlayer, Telao telao){
        this.amp = amp;
        this.streamingPlayer = streamingPlayer;
        this.projetor = projetor;
        this.pipoqueira = pipoqueira;
        this.telao = telao;
        this.luzes = luzes;
    }

    public void assistirFilme(String filme){
        System.out.println("Preparando para assistir filme...");
        pipoqueira.ligarPipoqueira();
        pipoqueira.rebentaPipoca();
        luzes.desligar();
        telao.abaixa();
        projetor.ligar();
        amp.ligar();
        amp.ajustaVolume();
        streamingPlayer.ligar();
        streamingPlayer.play(filme);
    }
    public void fimDoFilme(){
        System.out.println("Desligando kit");
        luzes.desligar();
        projetor.desligar();
    }
}
