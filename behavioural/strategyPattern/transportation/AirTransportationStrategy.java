package behavioural.strategyPattern.transportation;

public class AirTransportationStrategy implements TransportationStrategy{

    @Override
    public String travelPlan() {
        return "Air Travel is quick and covers long distances";
    }
    
}
