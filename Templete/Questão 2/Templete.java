package Templete.questão2;


public abstract class Templete {
    abstract void formaDePagamento();
    abstract void entrega();
    
    public void paraEntrega(){
        System.out.println("Produto enviado para entrega");
    }
    public void pagamentoEfetivado(String ok){
        System.out.println("Pagamento com " + ok + " realizado com sucesso");
    }

    abstract void adicionarAoCarrinho(Compra produto);
}
