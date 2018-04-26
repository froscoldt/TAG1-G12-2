package Maingame;

import Units.Unit;
import Dungeongeneration.Dungeon;

import Dungeongeneration.Room;
import Highscore.Highscore;
import Highscore.Timescore;
import Units.Enemy;
import Units.Player;
import java.util.ArrayList;

public class Controller {

    TUI tui = new TUI();
    Dungeon dun = new Dungeon();
    Room starting = dun.createMaze();

    Unit p = null;

    public void go() {
        boolean gameFinish;
        tui.askForPlayerName();
        p = new Player(tui.askForMove(), starting);
        tui.intro();
        tui.printString(p.getLocation().getDesc());
        Timescore timescore = new Timescore();
        while (p.getHealth() > 0 && p.getLocation() != dun.getListOfRooms().get(19)) {
            awaitingAnswer((Player) p);
        }
        timescore.endTimer();
        timescore.setScoreBasedOnTime((Player) p);
        Highscore highscore = new Highscore((Player) p);
        highscore.writeHighScoreToTable(highscore);
        highscore.readHighScoreTable();
        for (Highscore h : highscore.getHighScoreTable()) {
            System.out.println(h.toString());
        }
    }


    public void awaitingAnswer(Player player) {
        ActionConverter ac = new ActionConverter();
        Action action;
        String askingPlayer = tui.askForMove();
        action = ac.whatAction(askingPlayer);

        while (action == null) {
            if (askingPlayer.equalsIgnoreCase("help")) {
                tui.help();
                System.out.println("hej");
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

        checkPlayerAction(player, action, askingPlayer, dun.getListOfEnemies());
        if (ac.convert(askingPlayer) == null) {
            checkPlayerIfMove(player, action, askingPlayer);
        }
        enemyAction(player, dun.getListOfEnemies(), player.getLocation());
        tui.printPlayerHealth(player);

    }

    public void checkPlayerIfMove(Player player, Action action, String asking) {

        switch (action) {

            case GoNorth: {
                tui.roomChange(player.goNorth());
                player.addToScore(2);
                tui.getRoomDesc(player.getLocation());
                break;
            }
            case GoSouth: {
                tui.roomChange(player.goSouth());
                player.addToScore(2);
                tui.getRoomDesc(player.getLocation());
                break;
            }
            case GoEast: {
                tui.roomChange(player.goEast());
                player.addToScore(2);
                tui.getRoomDesc(player.getLocation());
                break;
            }
            case GoWest: {
                tui.roomChange(player.goWest());
                player.addToScore(2);
                tui.getRoomDesc(player.getLocation());
                break;
            }
        }
    }

    public void enemyAction(Player player, ArrayList<Enemy> enemies, Room playerRoom) {

        for (Enemy enemy : enemies) {
            if (enemy.getLocation() == playerRoom) {
                tui.encounter(enemy);
                if (enemy.checkAttack() == true) {
                    enemy.attack(player);
                    tui.enemyAttackedPlayer(enemy);
                    continue;
                }
                continue;
            }
            enemy.move();
            enemy.setAttack(false);

        }
    }

    public void checkPlayerAction(Player player, Action action, String asking, ArrayList<Enemy> enemylist) {
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
                //tui.displayInventory(dun.enemies());
                tui.displayInventory(player.getBackpack());
                break;
            }
            case use: {
                String itemName = asking.split(" ", 2)[1];
                for (int i = 0; i < player.getBackpack().size(); i++) {
                    if (player.getBackpack().get(i).getName().equalsIgnoreCase(itemName)) {
                        player.getBackpack().get(i).use(player);
                        player.addToScore(5);
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
            case attack: {
                String attackDeclaration = asking.split(" ", 2)[1];
                System.out.println(attackDeclaration);
                for (Enemy enemy : enemylist) {
                    if (enemy.getLocation() == player.getLocation() && attackDeclaration.equalsIgnoreCase(enemy.getName())) {
                        enemy.decreaseHealth(player.getDamage());
                        tui.enemyDamageTaken(enemy, player);
                        if (enemy.isDead()) {
                            player.addToScore(enemy.getMobScore(enemy));
                            enemylist.remove(enemy);
                            tui.enemyDeath(enemy);
                        }
                        return;
                    }
                }
                tui.enemyDoesNotExist();
                break;
            }

            default: {
                break;
            }
        }
    }
}
