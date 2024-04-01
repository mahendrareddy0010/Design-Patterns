package behavioural.mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int level = 0, score = 0;
    private List<String> inventory = new ArrayList<>();
    private GameStateSaver gameStateSaver = new GameStateSaver();

    public Game() {
        gameStateSaver.addState(new GameState(level, score, inventory));
    }

    public void play(int level, int score, List<String> items) {
        this.level = level;
        this.score = score;
        this.inventory.addAll(cloneList(items));
        this.gameStateSaver.addState(createSave());
    }

    private List<String> cloneList(List<String> items) {
        List<String> tmp = new ArrayList<>();
        for (String item : items) {
            tmp.add(item);
        }
        return tmp;
    }
    public void undo() {
        gameStateSaver.undo();
        GameState gameState = gameStateSaver.undo();
        loadGameState(gameState);
    }

    private void loadGameState(GameState gameState) {
        level = gameState.getLevel();
        score = gameState.getScore();
        inventory = cloneList(gameState.getInventory());
    }

    public GameState createSave() {
        GameState gameState = new GameState(level, score, cloneList(inventory));

        return gameState;
    }

    public void printStatus() {
        System.out.println("Game [level=" + level + ", score=" + score + ", inventory=" + inventory + "]");
    }

}
