package behavioural.mediatorPattern.components;

import behavioural.mediatorPattern.Mediator;

public interface Department {
    public void setMediator(Mediator mediator);
    public void sendMessage(String message, Department department);
    public void receiveMessage(String message);
}
