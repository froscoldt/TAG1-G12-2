package tag1;

import tag1.maze.Dungeon;
import tag1.maze.Room;

public class Controller {

    TUI tui = new TUI();
    Dungeon dun = new Dungeon();

    public void go() {
        Room starting = dun.createMaze();
        // text introduction to game
        Player player = new Player("", 0, starting);
        awaitingAnswer(player);

    }

    public void awaitingAnswer(Player player) {
        ActionConverter ac = new ActionConverter();
        String asking = tui.askForMove();
        Action action;

        do {
            action = ac.convert(asking);
            // hvis action ikke får et valid input, så returnerer den null, og bliver ved indtil inputtet er valid.
        } while (action == null);
    }

}
