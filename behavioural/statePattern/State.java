package behavioural.statePattern;

public interface State {
    public void publish(Document doc);
    public void approve(Document doc);
}
