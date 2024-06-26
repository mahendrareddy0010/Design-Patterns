package structural.bridgePattern.implementationComponents;

public class ManualTransmission implements Transmission {

    @Override
    public void applyGear(String vehicleType) {
        System.out.println("Manually applying the gear in " + vehicleType);
    }
}
