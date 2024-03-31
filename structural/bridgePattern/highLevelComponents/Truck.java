package structural.bridgePattern.highLevelComponents;

import structural.bridgePattern.implementationComponents.Transmission;

public class Truck extends Vehicle{
    public Truck(Transmission transmission){
        super(transmission);
    }

    @Override
    public void applyGear() {
        transmission.applyGear("Truck");
    }
}
