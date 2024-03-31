package creational.abstractFactoryMethod.pastries;

public class CoffeePastry implements Pastry{

    @Override
    public void serve() {
        System.out.println("Serving coffee pastry");
    }
}
