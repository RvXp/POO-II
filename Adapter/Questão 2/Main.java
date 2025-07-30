package questao2;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadoraDecimal = new CalculadoraDecimal();
        
        System.out.println(calculadoraDecimal.somar(10, 7));
        System.out.println(calculadoraDecimal.subtrair(10, 7));
        System.out.println(calculadoraDecimal.multiplicar(10, 7));
        

        Calculadora calculadoraBin = new CalculadoraAdapter(new CalculadoraBin());
        System.out.println(calculadoraBin.somar(101010111, 1000010100));
        System.out.println(calculadoraBin.subtrair(101010111, 1000010100));
        calculadoraBin.multiplicar(101010111, 1000010100);
    }
}
