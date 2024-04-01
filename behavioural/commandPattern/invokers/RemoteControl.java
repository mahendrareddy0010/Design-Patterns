package behavioural.commandPattern.invokers;

import behavioural.commandPattern.commands.Command;

public class RemoteControl {
    private Command command;

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }
}
