package behavioural.strategyPattern.accomodation;

public class HostelAccomodationStrategy implements AccomodationStrategy{
    
    @Override
    public String planStay() {
        return "Hostel stay is cheap and easy to find";
    }
    
}
