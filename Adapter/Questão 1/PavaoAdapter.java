package questão1;
public class PavaoAdapter implements Aves{
    private Pavao pavao;
    public PavaoAdapter(Pavao pavao){
        this.pavao = pavao;
    }
    public void voar(){
        System.out.println("Pavão não voa!");
    }
    public void emitirsom(){
        pavao.emitirsom();
    }
}
