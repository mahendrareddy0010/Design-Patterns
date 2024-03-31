package creational.abstractFactoryMethod;

import creational.abstractFactoryMethod.drinks.CoffeeDrink;
import creational.abstractFactoryMethod.drinks.Drink;
import creational.abstractFactoryMethod.pastries.CoffeePastry;
import creational.abstractFactoryMethod.pastries.Pastry;

public class CoffeeFactory  implements AbstractFactory{

    @Override
    public Drink getDrink() {
        return new CoffeeDrink();
    }

    @Override
    public Pastry getPatry() {
        return new CoffeePastry();
    }
    
}
