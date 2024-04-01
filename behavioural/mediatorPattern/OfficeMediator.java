package behavioural.mediatorPattern;

import behavioural.mediatorPattern.components.Department;

public class OfficeMediator implements Mediator{

    @Override
    public void communicate(String message, Department department) {
        department.receiveMessage(message);
    }
    
}
