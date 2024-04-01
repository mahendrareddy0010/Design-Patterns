package behavioural.commandPattern.commands;

import behavioural.commandPattern.receivers.Light;

public class LightTurnOffCommand implements Command {
    private Light receiverLight;

    public LightTurnOffCommand(Light receiverLight) {
        this.receiverLight = receiverLight;
    }

    @Override
    public void execute() {
        receiverLight.turnOff();
    }

}
