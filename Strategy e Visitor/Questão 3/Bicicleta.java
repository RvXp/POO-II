package Strategy_Visitor.questão3;

public class Bicicleta extends Veiculo{
    private String cor;
    private String mensagem;
    public Bicicleta(String cor){
        this.cor = cor;
    }
    public void accept(Visitor v){
        v.visit(this);
    }
    public String getCor() {
        return cor;
    }
    
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
        System.out.println(("Recebi mensagem: " + this.mensagem));
    }
}
