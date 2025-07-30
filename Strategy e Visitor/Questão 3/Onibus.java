package Strategy_Visitor.questão3;

public class Onibus extends Veiculo{
    private int quantLugares;
    private int anoFabricacao;
    private String mensagem;
    public Onibus(int quantLugares, int anoFabricacao){
        this.quantLugares = quantLugares;
        this.anoFabricacao = anoFabricacao;
    }
    public void accept(Visitor v){
       v.visit(this); 
    }
    public int getQuantLugares() {
        return quantLugares;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
        System.out.println(("Recebi mensagem: " + this.mensagem));
    }
    
}
