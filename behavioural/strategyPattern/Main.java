package behavioural.strategyPattern;

import behavioural.strategyPattern.accomodation.HotelAccomodationStrategy;
import behavioural.strategyPattern.activity.CulturalActivityStrategy;
import behavioural.strategyPattern.transportation.AirTransportationStrategy;

public class Main {
    public static void main(String[] args) {
        TravelPlan plan = new TravelPlan();
        plan.setTransportationStrategy(new AirTransportationStrategy());
        plan.setAccomodationStrategy(new HotelAccomodationStrategy());
        plan.setActivityStrategy(new CulturalActivityStrategy());

        System.out.println(plan.generatePlan());
    }
}
