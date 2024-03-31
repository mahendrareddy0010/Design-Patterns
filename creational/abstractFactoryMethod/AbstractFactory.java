package creational.abstractFactoryMethod;

import creational.abstractFactoryMethod.drinks.Drink;
import creational.abstractFactoryMethod.pastries.Pastry;

public interface AbstractFactory {
    public Drink getDrink();
    public Pastry getPatry();
}
