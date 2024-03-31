package structural.bridgePattern;

import structural.bridgePattern.highLevelComponents.Car;
import structural.bridgePattern.highLevelComponents.Truck;
import structural.bridgePattern.highLevelComponents.Vehicle;
import structural.bridgePattern.implementationComponents.AutomaticTransmission;
import structural.bridgePattern.implementationComponents.ManualTransmission;
import structural.bridgePattern.implementationComponents.Transmission;

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
