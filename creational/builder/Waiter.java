package creational.builder;

import creational.builder.builders.PizzaBuilder;

public class Waiter {
    private PizzaBuilder builder;

    public Waiter(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void cookPizza() {
        builder.createNewPizza();
        builder.setName("Typical Dominos");
        builder.setSize("Large");
        builder.setTopping("Small quantity of some non sense");
    }

    public Pizza getPizza() {
        return builder.getPizza();
    }
}
