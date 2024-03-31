package creational.builder.builders;

import creational.builder.Pizza;

public interface PizzaBuilder {
    public void createNewPizza();

    public void setName(String name);

    public void setSize(String size);

    public void setTopping(String topping);

    public Pizza getPizza();
}
