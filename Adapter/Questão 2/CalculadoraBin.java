package questao2;

public class CalculadoraBin {
    public int somar(int a, int b){
        String bin1 = Integer.toString(a);
        String bin2 = Integer.toString(b);
        int x = Integer.parseInt(bin1, 2);
        int y = Integer.parseInt(bin2, 2);        
        return x + y;
    }
    public int subtrair(int a, int b){
        String bin1 = Integer.toString(a);
        String bin2 = Integer.toString(b);
        int x = Integer.parseInt(bin1, 2);
        int y = Integer.parseInt(bin2, 2); 
        return x - y;
    }
}
