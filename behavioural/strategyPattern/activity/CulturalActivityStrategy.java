package behavioural.strategyPattern.activity;

public class CulturalActivityStrategy implements ActivityStrategy{

    @Override
    public String playActivity() {
        return "Temples, Zoos are good options";
    }
    
}
