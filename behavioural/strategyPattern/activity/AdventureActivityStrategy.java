package behavioural.strategyPattern.activity;

public class AdventureActivityStrategy implements ActivityStrategy{
    
    @Override
    public String playActivity() {
        return "Skydiving, trecking are good options";
    }
    
}
