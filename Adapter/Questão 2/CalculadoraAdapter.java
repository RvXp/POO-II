package questao2;

public class CalculadoraAdapter implements Calculadora{
    private CalculadoraBin calculadoraBin;

    public CalculadoraAdapter(CalculadoraBin calculadoraBin){
        this.calculadoraBin = calculadoraBin;
    }

    public int somar(int a, int b){
        return calculadoraBin.somar(a, b);
    }
    public int subtrair(int a, int b){
        return calculadoraBin.subtrair(a, b);
    }
    public int multiplicar(int a, int b){
        System.out.println("Calculadora binaria é incapaz de multiplizar");
        return 0;
    }

    
}