package behavioural.strategyPattern;

import behavioural.strategyPattern.accomodation.AccomodationStrategy;
import behavioural.strategyPattern.activity.ActivityStrategy;
import behavioural.strategyPattern.transportation.TransportationStrategy;

public class TravelPlan {
    private TransportationStrategy transportationStrategy;
    private AccomodationStrategy accomodationStrategy;
    private ActivityStrategy activityStrategy;
    
    public void setTransportationStrategy(TransportationStrategy transportationStrategy) {
        this.transportationStrategy = transportationStrategy;
    }

    public void setAccomodationStrategy(AccomodationStrategy accomodationStrategy) {
        this.accomodationStrategy = accomodationStrategy;
    }

    public void setActivityStrategy(ActivityStrategy activityStrategy) {
        this.activityStrategy = activityStrategy;
    }

    public String generatePlan() {
        StringBuilder plan = new StringBuilder();
        if (transportationStrategy != null) {
            plan.append(transportationStrategy.travelPlan()).append("\n");
        }
        if (accomodationStrategy != null) {
            plan.append(accomodationStrategy.planStay()).append("\n");
        }
        if (activityStrategy != null) {
            plan.append(activityStrategy.playActivity()).append("\n");
        }

        return plan.toString();
    }
}
