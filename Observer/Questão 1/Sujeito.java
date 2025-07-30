
public interface Sujeito {
    void addObserver(Obs obs);
    void removeObserver(Obs obs);
    void notifyObserver();
}
