package behavioural.commandPattern.commands;

import behavioural.commandPattern.receivers.Light;

public class LightTurnOnCommand implements Command{
    private Light receiverLight;

    public LightTurnOnCommand(Light receiverLight) {
        this.receiverLight = receiverLight;
    }

    @Override
    public void execute() {
        receiverLight.turnOn();
    }
    
}
