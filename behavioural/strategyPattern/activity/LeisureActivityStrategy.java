package behavioural.strategyPattern.activity;

public class LeisureActivityStrategy implements ActivityStrategy{
    
    @Override
    public String playActivity() {
        return "Beach, Movies, Gym are good options";
    }
    
}
