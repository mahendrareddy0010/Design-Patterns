package structural.decorator;


public abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public abstract double getCost();
    @Override
    public abstract String getDescription();

}
