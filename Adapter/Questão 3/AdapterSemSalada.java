package questão3;

public class AdapterSemSalada implements Hamburguer{
    private SemSalada semSalada;
    public AdapterSemSalada(SemSalada semSalada){
        this.semSalada = semSalada;
    }
    public void carne(){
        semSalada.carne();
    }
    public void queijo(){
        semSalada.queijo();
    }
    public void salada(){
        // Sem salada
    }
}
