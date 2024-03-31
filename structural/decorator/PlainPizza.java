package structural.decorator;


public class PlainPizza implements Pizza {
    private double price;
    private String description;

    public PlainPizza(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public double getCost() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
    
}
