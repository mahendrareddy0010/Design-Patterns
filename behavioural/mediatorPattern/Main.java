package behavioural.mediatorPattern;

import behavioural.mediatorPattern.components.Department;
import behavioural.mediatorPattern.components.FinanceDepartment;
import behavioural.mediatorPattern.components.HRDepartment;
import behavioural.mediatorPattern.components.TechnicalDepartment;

public class Main {
    public static void main(String[] args) {
        Department hrDepartment = new HRDepartment();
        Department financeDepartment = new FinanceDepartment();
        Department technicalDepratment = new TechnicalDepartment();

        Mediator mediator = new OfficeMediator();

        hrDepartment.setMediator(mediator);
        financeDepartment.setMediator(mediator);
        technicalDepratment.setMediator(mediator);

        hrDepartment.sendMessage("Hey i am from HR, do this for me", financeDepartment);
        hrDepartment.sendMessage("Hey i am from HR, do this for me", technicalDepratment);
    }
}
