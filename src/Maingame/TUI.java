package Maingame;

import Dungeongeneration.Room;
import Highscore.Highscore;
import Highscore.Timescore;
import Items.Armor;
import java.util.ArrayList;
import java.util.Scanner;
import Items.Item;
import Items.Potion;
import Items.Weapon;
import Units.Enemy;
import Units.Player;

public class TUI {

    Scanner sc = new Scanner(System.in);
    String[] commands = {
        "1. go north",
        "2. go south",
        "3. go east",
        "4. go west",
        "5. help                    - hopefully self explanatory",
        "6. pick up item            - picks up an item in the room",
        "7. check inventory         - lists all items and their descriptions in your inventory",
        "8. check stats             - gives you stats over damage, armor and inventory count",
        "9. use <item name>         - uses an item from your inventory with the name specified",
        "10. attack <EnemyName>     - will attack the first enemy if multiple enemies with the same name exists"};

    public String askForMove() {
        System.out.println();
        String input = sc.nextLine();
        System.out.println("--------------------------------------------------------------------");
        return input;
    }

    public void printScore(Highscore highscore) {
        ArrayList<Highscore> h = highscore.getHighScoreTable();
        System.out.println("- HIGHSCORES -");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + h.get(i).getPlayer() + "'s highscore: " + h.get(i).getHighScore());
        }

    }
    
    public void printPlayerScoreForThisGame(Player player, Timescore timescore) {
        System.out.println("Your highscore this round: " + player.getScore() + "\n");
    }

    public void intro() {
        System.out.println("Welcome to our game."
                + "\nIn this game you have to walk through rooms, find items, slay monsters."
                + "\nTo win the game you have to kill the boss and find the exit room."
                + "\n <The boss is named \"Ronnie\" and is wandering through the dungeon>"
                + "\nWinning the game faster, results higher highscore\n"
                + "\nGot difficulty? type \"help\" to get a list of commands"
                + "\n -----------------------------------------------------------------------------");
    }

    public void inputError() {
        System.out.println("Error: Wrong input. Type \"help\" in "
                + "order to view possible commands");
    }

    public void getRoomDesc(Room room) {
        System.out.println("\n- " + room.getDesc() + " -\n");
    }

    public void askForPlayerName() {
        System.out.println("Type your name: ");
    }

    public void help() {
        for (String string : commands) {
            System.out.println(string);
        }
    }

    public void quittingGame() {
        System.out.println("You quitter!");
    }

    public void losingGame() {
        System.out.println("\n - You lost - \n");
    }

    public void winningGame() {
        System.out.println("\n - You found the exit. You won! - \n");
    }

    public void printString(String str) {
        System.out.println(str);

    }

    public void noItemInRoom() {
        System.out.println("You see no items in the room.");
    }

    public void pickUpItem(Item item) {
        System.out.println("You picked up " + item.toString() + "!");
    }

    public void usedItem(Item item) {
        String type = "";
        if (item instanceof Weapon) {
            type = "damage increased by " + ((Weapon) item).getDamage();
        }

        if (item instanceof Potion) {
            type = "health increased by " + ((Potion) item).getHealing();
        }

        if (item instanceof Armor) {
            type = "armor increased by " + ((Armor) item).getArmor();
        }

        System.out.println("You used " + item.getName() + "!\nYour " + type);
    }

    public void noItem() {
        System.out.println("You dont have that item");
    }

    public String enemyStats(Enemy enemy) {
        return String.valueOf(enemy.getHealth());
    }

    public void encounter(Enemy enemy) {
        System.out.println("An enemy stands before you: " + enemy.getName() + " - HP: " + enemyStats(enemy));
    }

    public int checkUse(String str) {
        String use;
        int num;
        if (str.contains("use")) {
            use = str.split(" ")[0];
            num = (int) Integer.parseInt(str.split(" ")[1]);
            return num;
        }
        return 0;
    }

    public void roomChange(Boolean bool) {
        if (bool == true) {
            System.out.println("You entered the room succesfully");
        } else {
            System.out.println("There is no doorway in that direction.");
        }
    }

    public void displayInventory(ArrayList array) {
        for (Object object : array) {
            System.out.println(object.toString());
        }

    }

    public void enemyDeath(Enemy enemy) {
        System.out.println("You killed " + enemy.getName());
    }

    public void enemyDamageTaken(Enemy enemy, Player player) {
        System.out.println("You dealt " + String.valueOf(player.getDamage()) + " damage to " + enemy.getName());

    }

    public void enemyDoesNotExist() {
        System.out.println("No such enemy");

    }

    public void enemyAttackedPlayer(Enemy enemy, Player player) {
        if (player.getArmor() >= 10) {
            System.out.println("You got attacked by " + enemy.getName() + " for " + enemy.getDamage() + " (-" + player.getArmor() / 10 + ")");
        } else {
            System.out.println("You got attacked by " + enemy.getName() + " for " + enemy.getDamage());
        }
    }

    public void printPlayerHealth(Player player) {
        System.out.println("Your health is: " + player.getHealth());
    }
}
