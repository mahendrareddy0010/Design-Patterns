package behavioural.statePattern;

public class DraftState implements State {

    @Override
    public void publish(Document doc) {
        doc.state = new ModerationState();
        System.out.println("Sent for Moderation");
    }

    @Override
    public void approve(Document doc) {
        System.out.println("Can not be approved before Moderation");
    }
    
}
