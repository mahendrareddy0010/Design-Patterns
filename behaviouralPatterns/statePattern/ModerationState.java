package behaviouralPatterns.statePattern;

public class ModerationState implements State {

    @Override
    public void publish(Document doc) {
        System.out.println("Can not be re-publish for moderation");
    }

    @Override
    public void approve(Document doc) {
        doc.state = new ApprovedState();
        System.out.println("Sent for Approval");
    }
    
}
