package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        Car customCar = (Car) basicCar.clone();

        if (customCar == basicCar) {
            System.out.println("True");
        }
        customCar.customize("Red", "accessories");

        System.out.println(basicCar);
        System.out.println(customCar);
    }
}
