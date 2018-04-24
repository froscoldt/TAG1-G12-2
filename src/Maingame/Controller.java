package Maingame;

import Units.Unit;
import Dungeongeneration.Dungeon;
import Dungeongeneration.EnemyGeneration;
import Dungeongeneration.Room;
import Units.Enemy;
import Units.Player;
import java.util.ArrayList;

public class Controller {

    TUI tui = new TUI();
    Dungeon dun = new Dungeon();
    Room starting = dun.createMaze();

    Unit p = null;

    public void go() {
        tui.intro();
        tui.askForPlayerName();
        tui.askForMove();
        p = new Player(tui.askForMove(), starting);
        tui.printString(p.getLocation().getDesc());
        while (true) {
            awaitingAnswer((Player) p);
        }
    }

    public void awaitingAnswer(Player player) {
        enemyAction(player, dun.enemies(), player.getLocation());
        ActionConverter ac = new ActionConverter();
        Action action;
        String askingPlayer = tui.askForMove();
        action = ac.whatAction(askingPlayer);

        while (action == null) {
            if (askingPlayer.equalsIgnoreCase("help")) {
                tui.help();
                return;
            }
            if (askingPlayer.equalsIgnoreCase("quit")) {
                tui.quittingGame();
                System.exit(0);
            }

            tui.inputError();
            askingPlayer = tui.askForMove();
            action = ac.whatAction(askingPlayer);
        }

        checkPlayerAction(player, action, askingPlayer);
        if (ac.convert(askingPlayer) == null) {
            checkPlayerIfMove(player, action, askingPlayer);
        }

    }

    public void checkPlayerIfMove(Player player, Action action, String asking) {

        switch (action) {

            case GoNorth: {
                tui.roomChange(player.goNorth());
                tui.printString(player.getLocation().getDesc());
                break;
            }
            case GoSouth: {
                tui.roomChange(player.goSouth());
                tui.printString(player.getLocation().getDesc());
                break;
            }
            case GoEast: {
                tui.roomChange(player.goEast());
                tui.printString(player.getLocation().getDesc());
                break;
            }
            case GoWest: {
                tui.roomChange(player.goWest());
                tui.printString(player.getLocation().getDesc());
                break;
            }
        }
    }

    public void enemyAction(Player player, ArrayList<Enemy> enemies, Room playerRoom) {

        for (Enemy enemy : enemies) {
            if (enemy.getLocation() == playerRoom) {
                System.out.println("An enemy!");
            }
            /*
            while (enemy.getLocation() == playerRoom) {                
                // attack phase
            }
             */
            enemy.move();
        }
    }

    public void checkPlayerAction(Player player, Action action, String asking) {
        switch (action) {
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
                tui.displayInventory(dun.enemies());
                //tui.displayInventory(player.getBackpack());
                break;
            }
            case use: {
                String itemName = asking.split(" ", 2)[1];
                for (int i = 0; i < player.getBackpack().size(); i++) {
                    if (player.getBackpack().get(i).getName().equalsIgnoreCase(itemName)) {
                        player.getBackpack().get(i).use(player);
                        tui.usedItem(player.getBackpack().get(i));
                        player.getBackpack().remove(i);
                        return;
                    }
                }
                tui.noItem();
                break;
            }
            case checkStats: {
                tui.printString(player.stats());
                break;
            }
            default: {
                break;
            }
        }
    }
}