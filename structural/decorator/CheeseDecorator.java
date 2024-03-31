package structural.decorator;

public class CheeseDecorator extends ToppingDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }
    
}
