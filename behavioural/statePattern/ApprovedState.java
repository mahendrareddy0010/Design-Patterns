package behavioural.statePattern;

public class ApprovedState implements State{

    @Override
    public void publish(Document doc) {
        System.out.println("Already approved, So can not publish again");
    }

    @Override
    public void approve(Document doc) {
        System.out.println("Already approved, So can not approve again");
    }
    
}
