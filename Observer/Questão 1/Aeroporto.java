
public class Aeroporto implements Obs{
    public void update(double temp, double umidade, double vento){
        if(vento > 100.0){
            System.out.println("Alerta de perigo!");
        }else{
            System.out.println("Vento bom");
        }
    }
}
