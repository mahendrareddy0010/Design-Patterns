package behavioural.statePattern;

public class Document {
    State state;
    public Document() {
        this.state = new DraftState();
    }
    public void publish() {
        state.publish(this);
    }
    public void approve() {
        state.approve(this);
    }
}
