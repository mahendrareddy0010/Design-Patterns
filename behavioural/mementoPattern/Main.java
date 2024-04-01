package behavioural.mementoPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.play(1,80, List.of("item1", "item2") );
        game.play(3,95, List.of("item3", "item4") );
        game.printStatus();
        game.undo();
        game.printStatus();
    }
}
