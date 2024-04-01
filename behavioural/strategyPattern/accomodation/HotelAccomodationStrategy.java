package behavioural.strategyPattern.accomodation;

public class HotelAccomodationStrategy implements AccomodationStrategy{

    @Override
    public String planStay() {
        return "Hotel may be costly but comfortable";
    }
    
}
