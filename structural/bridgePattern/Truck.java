package structural.bridgePattern;

public class Truck extends Vehicle{
    public Truck(Transmission transmission){
        super(transmission);
    }

    @Override
    public void applyGear() {
        transmission.applyGear("Truck");
    }
}
