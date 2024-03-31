package creational.builder.builders;

import creational.builder.Pizza;

public class DominosPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public DominosPizzaBuilder() {
    }

    @Override
    public void createNewPizza() {
        this.pizza = new Pizza();
    }

    @Override
    public void setName(String name) {
        pizza.setName(name);
    }

    @Override
    public void setSize(String size) {
        pizza.setSize(size);
    }

    @Override
    public void setTopping(String topping) {
        pizza.setTopping(topping);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
