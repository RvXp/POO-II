
public class Prefeitura implements Obs{

    public void update(double temp, double umidade, double vento){
        if(umidade < 10.0){
            System.out.println("Defesa civil em alerta: umidade baixa");
        }else{
            System.out.println("Umidade estavel");
        }
    }
}
