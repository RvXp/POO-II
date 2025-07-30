
import java.util.ArrayList;
import java.util.List;

public class CET implements Sujeito {
    private List<Obs> observers;
    private double temperatura;
    private double umidade;
    private double vento;

    public CET() {
        observers = new ArrayList<Obs>();
    }

    public void addObserver(Obs obs) {
        observers.add(obs);
    }

    public void removeObserver(Obs obs) {
        observers.remove(obs);
    }

    public void notifyObserver() {
        for (Obs o : observers) {
            o.update(temperatura, umidade, vento);
        }
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notifyObserver();
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
        notifyObserver();
    }
    public void setVento(double vento){
        this.vento = vento;
        notifyObserver();
    }

}
