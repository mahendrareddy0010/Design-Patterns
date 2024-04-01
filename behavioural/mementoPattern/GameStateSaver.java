package behavioural.mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class GameStateSaver {
    private List<GameState> history;

    public GameStateSaver() {
        this.history = new ArrayList<>();
    }

    public void addState(GameState gameState) {
        history.add(gameState);
    }

    public GameState undo() {
        return history.removeLast();
    }
}
