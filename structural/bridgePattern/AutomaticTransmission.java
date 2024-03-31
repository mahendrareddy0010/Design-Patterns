package structural.bridgePattern;

public class AutomaticTransmission implements Transmission{

    @Override
    public void applyGear(String vehicleType) {
        System.out.println("Automatically applying the gear in " + vehicleType);
    }
    
}
