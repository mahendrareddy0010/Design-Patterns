package creational.abstractFactoryMethod.drinks;

public class TeaDrink implements Drink{

    @Override
    public void serve() {
        System.out.println("Serving Tea Drink");
    }
    
}
