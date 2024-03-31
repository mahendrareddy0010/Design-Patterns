package structural.bridgePattern.highLevelComponents;

import structural.bridgePattern.implementationComponents.Transmission;

public abstract class Vehicle {
    Transmission transmission;

    public Vehicle(Transmission transmission) {
        this.transmission = transmission;
    }
    
    abstract public void applyGear();
}
