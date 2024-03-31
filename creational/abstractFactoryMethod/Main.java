package creational.abstractFactoryMethod;

import creational.abstractFactoryMethod.drinks.Drink;
import creational.abstractFactoryMethod.pastries.Pastry;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        TeaFactory teaFactory = new TeaFactory();

        Drink coffeeDrink = coffeeFactory.getDrink();
        Pastry coffeePastry = coffeeFactory.getPatry();

        Drink teaDrink = teaFactory.getDrink();
        Pastry teaPastry = teaFactory.getPatry();

        coffeeDrink.serve();
        coffeePastry.serve();
        teaDrink.serve();
        teaPastry.serve();
    }
}
