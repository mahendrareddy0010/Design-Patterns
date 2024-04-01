package behavioural.strategyPattern.transportation;

public class RoadTransportationStrategy implements TransportationStrategy {

    @Override
    public String travelPlan() {
        return "Road travel is flexible , you can travel at your own pace and availability";
    }

}
