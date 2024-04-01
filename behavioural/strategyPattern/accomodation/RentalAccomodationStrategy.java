package behavioural.strategyPattern.accomodation;

public class RentalAccomodationStrategy implements AccomodationStrategy{

    @Override
    public String planStay() {
        return "Rental is good for family but also bit costly";
    }
    
}
