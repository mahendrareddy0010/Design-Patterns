package behavioural.mediatorPattern;

import behavioural.mediatorPattern.components.Department;

public interface Mediator {
    public void communicate(String message, Department department);
}
