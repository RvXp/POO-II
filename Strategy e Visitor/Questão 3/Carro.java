package Strategy_Visitor.questão3;

public class Carro extends Veiculo{
    private String cor;
    private String marca;
    private String modelo;
    private String mensagem;
    public Carro(String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void accept(Visitor v){
        v.visit(this);
    }

    public String getCor() {
        return cor;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
        System.out.println(("Recebi mensagem: " + this.mensagem));
    }
}
