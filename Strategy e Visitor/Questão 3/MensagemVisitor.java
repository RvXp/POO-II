package Strategy_Visitor.questão3;

public class MensagemVisitor implements Visitor {
    public void visit(Carro c){
        c.setMensagem("favor atualizar dados do IPVA");
    }
    public void visit(Onibus o){
        o.setMensagem("atenção para atualização das licenças");
    }
    public void visit(Bicicleta b){
        b.setMensagem("comemore no parque o dia do ciclismo");
    }
}
