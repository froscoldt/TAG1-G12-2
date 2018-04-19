package tag1;

import tag1.maze.Dungeon;
import tag1.maze.Room;
import tag2.items.Item;

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
                tui.pickUpItem(player.getLocation().getRoomItem());
                player.getLocation().setRoomItem(null);
                break;
            }
            case checkInventory: {
                tui.displayInventory(player.getBackpack());
                break;
            }
            case use: {
                String itemName = asking.split(" ",2)[1];
                
                for (int i = 0; i < player.getBackpack().size(); i++) {
                    if (player.backpack.get(i).getName().equalsIgnoreCase(itemName)) {
                        player.backpack.get(i).use(player);
                        tui.usedItem(player.backpack.get(i));
                        player.backpack.remove(i);
                    } else {
                        tui.noItem();
                    }
                     
                }
                
                break;
            }
            case checkStats: {
                tui.playerStats("metode i player som returnerer damage health og armor");
                break;
            }
            default:
                break;

        }

    }

}
