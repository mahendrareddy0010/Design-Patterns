package structural.decorator;

public class PepperoniDecorator extends ToppingDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return this.pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }
}
