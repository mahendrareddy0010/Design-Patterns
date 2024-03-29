package behaviouralPatterns.observerPattern;

public interface Subject {
    public void addOserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObservers();
}
