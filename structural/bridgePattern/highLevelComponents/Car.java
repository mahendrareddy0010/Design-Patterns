package structural.bridgePattern.highLevelComponents;

import structural.bridgePattern.implementationComponents.Transmission;

public class Car extends Vehicle{
    public Car(Transmission transmission){
        super(transmission);
    }

    @Override
    public void applyGear() {
        transmission.applyGear("Car");
    }
}
