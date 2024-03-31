package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza(100, "Typical Dominos");

        Pizza addedPizza = new CheeseDecorator(new PepperoniDecorator(plainPizza));

        System.out.println("Price : "+addedPizza.getCost());
        System.out.println("Description : " + addedPizza.getDescription());
    }
}
