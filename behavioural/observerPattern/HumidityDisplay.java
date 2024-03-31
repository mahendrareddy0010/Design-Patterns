package behavioural.observerPattern;

public class HumidityDisplay implements Observer {
    private Subject subject;

    public HumidityDisplay(Subject subject) {
        this.subject = subject;
        this.subject.addOserver(this);
    }

    @Override
    public void update(double temparature, double humidity, double pressure) {
        System.out.println(String.format("Humidity : %.2f", humidity));
    }
    
}
