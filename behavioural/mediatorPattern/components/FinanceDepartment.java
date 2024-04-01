package behavioural.mediatorPattern.components;

import behavioural.mediatorPattern.Mediator;

public class FinanceDepartment implements Department{
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message, Department department) {
        this.mediator.communicate(message, department);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received msg at (Finance): " + message);
    }
    
}
