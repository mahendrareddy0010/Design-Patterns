package creational.builder;


import creational.builder.builders.PizzaBuilder;
import creational.builder.builders.DominosPizzaBuilder;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder builder = new DominosPizzaBuilder();
        Waiter waiter = new Waiter(builder);

        waiter.cookPizza();
        Pizza pizza = waiter.getPizza();

        System.out.println(pizza);
    }
}
