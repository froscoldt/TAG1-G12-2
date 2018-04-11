package tag1;

import tag1.maze.Dungeon;
import tag1.maze.Room;

public class Controller {

    TUI tui = new TUI();
    Dungeon dun = new Dungeon();

    public void go() {
        Room starting = dun.createMaze();
        tui.intro();
        Player player = new Player("", 0, starting);
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
                continue;
            }
            if (asking.equalsIgnoreCase("quit")) {
                tui.quit(); // kommer ikke til at se dette.
                System.exit(0);
            }

            tui.error();
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
            // tui errorDirection ? 
            
            
        } else {
            player.setLocation(newLocation);
            // tui desc.
        }


    }

}
