package Strategy_Visitor.questão2;

public class Item {
    private String nome;
    private double valor;
    public Item(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }
    public String getQuant() {
        return nome;
    }
    public void setQuant(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
