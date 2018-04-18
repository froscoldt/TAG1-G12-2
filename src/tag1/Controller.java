package tag1;

import tag1.maze.Dungeon;
import tag1.maze.Room;

public class Controller {

    TUI tui = new TUI();
    Dungeon dun = new Dungeon();

    public void go() {
        Room starting = dun.createMaze();
        tui.intro();
        Player player = new Player("", starting);
        tui.printString(player.getLocation().getDesc());
        while (true) {
            awaitingAnswer(player);
        }

    }

    public void awaitingAnswer(Player player) {
        ActionConverter ac = new ActionConverter();
        Action action;
        String asking = tui.askForMove();
        action = ac.convert(asking);

        while (action == null) {
            if (asking.equalsIgnoreCase("help")) {
                tui.help();
            }
            if (asking.equalsIgnoreCase("quit")) {
                tui.quit();
                System.exit(0);
            }

            tui.error();
            asking = tui.askForMove();
            action = ac.convert(asking);
        }

        Room location = player.getLocation();
        Room newLocation = null;

        switch (action) {
            case GoNorth: {
                newLocation = location.getNorth();
                break;
            }
            case GoSouth: {
                newLocation = location.getSouth();
                break;
            }
            case GoEast: {
                newLocation = location.getEast();
                break;
            }
            case GoWest: {
                newLocation = location.getWest();
                break;
            }
            default:
                break;

        }

        if (newLocation == null) {
            tui.noDirection();
        } else {
            player.setLocation(newLocation);
            tui.printString(player.getLocation().getDesc());
        }

    }

}
