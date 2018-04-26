package Maingame;

import Units.Unit;
import Dungeongeneration.Dungeon;

import Dungeongeneration.Room;
import Highscore.Highscore;
import Highscore.Timescore;
import Units.Boss;
import Units.Enemy;
import Units.Player;
import java.util.ArrayList;

public class Controller {

    TUI tui = new TUI();
    Dungeon dun = new Dungeon();
    Room starting = dun.createMaze();
    Timescore timescore = new Timescore();

    Unit p = null;

    public void go() {
        boolean gameFinish;
        tui.askForPlayerName();
        p = new Player(tui.askForMove(), starting);
        tui.intro();
        tui.printString(p.getLocation().getDesc());
        while (p.getHealth() > 0 && (p.getLocation() != dun.getListOfRooms().get(19) || dun.getListOfEnemies().contains(dun.getBoss())== true)) {
            awaitingAnswer((Player) p);
            
            
            
        }
        tui.winningGame();
        timeScores();
        printScores();
        
    }
    public void timeScores() {
        timescore.endTimer();
        timescore.setScoreBasedOnTime((Player) p);    
    }
    
    public void printScores() {
        Highscore highscore = new Highscore((Player) p);
        highscore.writeHighScoreToTable(highscore);
        highscore.readHighScoreTable();
        highscore.setHighScoreTable(highscore.sortHighScore(highscore.getHighScoreTable()));
        tui.printScore(highscore);
    }

    public void awaitingAnswer(Player player) {
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
                printScores();
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
                    if (player.getHealth() <= 0) {
                        tui.printPlayerHealth(player);
                        tui.losingGame();
                        printScores();
                        System.exit(0);
                    }
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
                player.addToScore(1);
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
