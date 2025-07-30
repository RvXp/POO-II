package Templete.questao1;

public abstract class Template {
    public void aqueceAgua(){
        System.out.println("Aquecendo a agua!");
    }
    public void colocaXicara(){
        System.out.println("Colocando xicara");
    }
    abstract void preparaBebida();
    abstract void adicionaCondimentos();

    public void preparaPedido(){
        aqueceAgua();
        preparaBebida();
        colocaXicara();
        adicionaCondimentos();
    }
}
