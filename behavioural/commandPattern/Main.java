package behavioural.commandPattern;

import behavioural.commandPattern.commands.Command;
import behavioural.commandPattern.commands.LightTurnOffCommand;
import behavioural.commandPattern.commands.LightTurnOnCommand;
import behavioural.commandPattern.invokers.RemoteControl;
import behavioural.commandPattern.receivers.Light;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightTurnOnCommnad = new LightTurnOnCommand(light);
        Command lightTurnOffCommnad = new LightTurnOffCommand(light);
        RemoteControl rc = new RemoteControl();

        rc.setCommand(lightTurnOnCommnad);
        rc.pressButton();

        rc.setCommand(lightTurnOffCommnad);
        rc.pressButton();
    }
}
