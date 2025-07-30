package Templete.questao1;

public class Cafe extends Template{
    @Override
    void preparaBebida(){
        System.out.println("Adicionando po de cafe");
    }
    @Override 
    void adicionaCondimentos(){
        System.out.println("Adicionando açucar");
    }
}
