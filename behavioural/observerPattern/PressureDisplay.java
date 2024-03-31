package behavioural.observerPattern;

public class PressureDisplay implements Observer {
    private Subject subject;

    public PressureDisplay(Subject subject) {
        this.subject = subject;
        this.subject.addOserver(this);
    }

    @Override
    public void update(double temparature, double humidity, double pressure) {
        System.out.println(String.format("Pressure : %.2f", pressure));
    }
    
}
