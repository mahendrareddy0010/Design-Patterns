package behavioural.mementoPattern;

import java.util.List;

public class GameState {
    private int level, score;
    private List<String> inventory;
    
    public GameState(int level, int score, List<String> inventory) {
        this.level = level;
        this.score = score;
        this.inventory = inventory;
    }
    public int getLevel() {
        return level;
    }
    public int getScore() {
        return score;
    }
    public List<String> getInventory() {
        return inventory;
    }
}
