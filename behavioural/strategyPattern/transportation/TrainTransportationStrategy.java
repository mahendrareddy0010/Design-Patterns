package behavioural.strategyPattern.transportation;

public class TrainTransportationStrategy implements TransportationStrategy{

    @Override
    public String travelPlan() {
        return "Train travel is good and cheap for city to city travels";
    }
    
}
