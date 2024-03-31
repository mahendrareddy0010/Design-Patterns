package structural.bridgePattern;

public abstract class Vehicle {
    Transmission transmission;

    public Vehicle(Transmission transmission) {
        this.transmission = transmission;
    }
    
    abstract public void applyGear();
}
