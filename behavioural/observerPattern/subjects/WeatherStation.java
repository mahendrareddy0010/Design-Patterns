package behavioural.observerPattern.subjects;

import java.util.HashSet;
import java.util.Set;

import behavioural.observerPattern.observers.Observer;

public class WeatherStation implements Subject {
    private Set<Observer> observers;
    private double temparature;
    private double humidity;
    private double pressure;

    public WeatherStation() {
        observers = new HashSet<>();
    }

    @Override
    public void addOserver(Observer obs) {
        this.observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        this.observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(temparature, humidity, pressure);
        }
    }

    public void setMeasurements(double temparature, double humidity, double pressure) {
        this.temparature = temparature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
    
}
