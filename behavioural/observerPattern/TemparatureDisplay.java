package behavioural.observerPattern;

public class TemparatureDisplay implements Observer {
    private Subject subject;

    public TemparatureDisplay(Subject subject) {
        this.subject = subject;
        this.subject.addOserver(this);
    }

    @Override
    public void update(double temparature, double humidity, double pressure) {
        System.out.println(String.format("Temparature : %.2f", temparature));
    }

}
