package Observer.questão2;

public interface Sujeito {
    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObserver();
}
