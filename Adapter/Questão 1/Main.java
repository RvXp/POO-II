package questão1;
public class Main {

    public static void main(String[] args) {
        Aves pato = new Pato();
        pato.voar();
        pato.emitirsom();

        Aves pavaoAzul = new PavaoAdapter(new Pavao());
        pavaoAzul.voar();
        pavaoAzul.emitirsom();
    
    }
}