package Observer.questão2;

import java.util.ArrayList;

public class Acao implements Sujeito{
    private ArrayList<Observer> investidores;
    private double acao;

    public Acao(){
        investidores = new ArrayList<Observer>();
    }
    public void addObserver(Observer investidor){
        investidores.add(investidor);
    }
    public void removeObserver(Observer investidor){
        investidores.remove(investidor);
    }
    public void notifyObserver(){
        for(Observer o : investidores){
            o.update(acao);
        }
    }
    public void setAcao(double acao){
        this.acao = acao;
        notifyObserver();
    }
}
