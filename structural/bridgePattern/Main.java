package structural.bridgePattern;

public class Main {
    public static void main(String[] args) {
        Transmission manualTransmission = new ManualTransmission();
        Transmission automaticTransmission = new AutomaticTransmission();
        Vehicle manualCar = new Car(manualTransmission);
        Vehicle automaticTruck = new Truck(automaticTransmission);

        manualCar.applyGear();
        automaticTruck.applyGear();
    }
}
