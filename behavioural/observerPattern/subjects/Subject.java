package behavioural.observerPattern.subjects;

import behavioural.observerPattern.observers.Observer;

public interface Subject {
    public void addOserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObservers();
}
