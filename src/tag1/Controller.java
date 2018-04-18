package tag1;

import tag1.maze.Dungeon;
import tag1.maze.Room;

public class Controller {

    TUI tui = new TUI();
    Dungeon dun = new Dungeon();
    Room starting = dun.createMaze();
    PlayerDemo p = new PlayerDemo("", starting);

    public void go() {
        tui.intro();
        tui.printString(p.getLocation().getDesc());
        while (true) {
            awaitingAnswer(p);
        }
    }
    
    public void move(PlayerDemo p, String input) {
        if(input.equalsIgnoreCase("go east") && p.goEast() == true) {
            p.setLocation(p.getLocation().getEast());
        }
        if(input.equalsIgnoreCase("go north") && p.goNorth() == true) {
            p.setLocation(p.getLocation().getNorth());
        }
        if(input.equalsIgnoreCase("go south") && p.goSouth() == true) {
            p.setLocation(p.getLocation().getSouth());
        }
        if(input.equalsIgnoreCase("go west") && p.goWest() == true) {
            p.setLocation(p.getLocation().getWest());
        }
    }

    public void awaitingAnswer(PlayerDemo player) {
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
