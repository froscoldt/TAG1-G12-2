package tag1;

import tag1.maze.Dungeon;
import tag1.maze.Room;

public class Controller {

    TUI tui = new TUI();
    Dungeon dun = new Dungeon();
    Room starting = dun.createMaze();
    Player p = new Player("", starting);

    public void go() {
        tui.intro();
        tui.printString(p.getLocation().getDesc());
        while (true) {
            awaitingAnswer(p);
        }
    }

    /*
    public void awaitingAnswer2() {
        - ask for player input
        tui.askForMove();
        save the above input to a string. 
        place that string into something that can use it.
    
        run the input through cases / match strings in an array.
        depending on the match, do something. 
        if none matches, return String "invalid input"
    
    
    }
    
    
     */
    public void awaitingAnswer(Player player) {
        ActionConverter ac = new ActionConverter();
        Action action;
        String asking = tui.askForMove();
        action = ac.convert(asking);

        while (action == null) {
            if (asking.equalsIgnoreCase("help")) {
                tui.help();
                return;
            }
            if (asking.equalsIgnoreCase("quit")) {
                tui.quittingGame();
                System.exit(0);
            }

            tui.inputError();
            asking = tui.askForMove();
            action = ac.convert(asking);
        }

        switch (action) {
            case GoNorth: {
                tui.validRoomChange(player.goNorth());
                tui.printString(player.getLocation().getDesc());
                break;
            }
            case GoSouth: {
                tui.validRoomChange(player.goSouth());
                tui.printString(player.getLocation().getDesc());
                break;
            }
            case GoEast: {
                tui.validRoomChange(player.goEast());
                tui.printString(player.getLocation().getDesc());
                break;
            }
            case GoWest: {
                tui.validRoomChange(player.goWest());
                tui.printString(player.getLocation().getDesc());
                break;
            }
            case pickUp: {
                if (player.getLocation().getRoomItem() == null) {
                    tui.noItemInRoom();
                    break;
                }
                player.addItemToInventory(player.getLocation().getRoomItem());
                player.getLocation().setRoomItem(null);
                break;
            }
            case checkInventory: {
                tui.displayInventory(player.getBackpack());
                break;
            }
            case use: {
                player.use(0);
                // på en måde skal vi kunne få spilleren til at vælge en item fra inventory arrayet i player klassen.
                break;
            }
            default:
                break;

        }

    }

}
