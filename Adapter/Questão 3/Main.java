package questão3;
// Temos uma Hamburgueria (com possibilidade de expansão), 
// entrantando temos dois lanches, um Hamburguer com salada, e um sem salada, para padronizar a Hamburgueria temos que os Hamburgueres compartilham da mesma interface
// Como salada sera presente na maioria dos lanches, precisamos adaptar o hamburguer sem salada para que possa implementar o a interface padrão  
public class Main {
    public static void main(String[] args) {
       Hamburguer comSalada = new ComSalada();
       System.out.println("Opção 1:");
       comSalada.carne();
       comSalada.queijo();
       comSalada.salada();
       
       Hamburguer semSalada = new AdapterSemSalada(new SemSalada());
       System.out.println("Opção 2:");
       semSalada.carne();
       semSalada.queijo();
       semSalada.salada();
    }
}
