package creational.abstractFactoryMethod;

import creational.abstractFactoryMethod.drinks.Drink;
import creational.abstractFactoryMethod.drinks.TeaDrink;
import creational.abstractFactoryMethod.pastries.Pastry;
import creational.abstractFactoryMethod.pastries.TeaPastry;

public class TeaFactory implements AbstractFactory{

    @Override
    public Drink getDrink() {
        return new TeaDrink();
    }

    @Override
    public Pastry getPatry() {
        return new TeaPastry();
    }
    
}
