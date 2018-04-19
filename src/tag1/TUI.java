/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag1;

import java.util.ArrayList;
import java.util.Scanner;
import tag2.items.Item;

/**
 *
 * @author Mark
 */
public class TUI {

    Scanner sc = new Scanner(System.in);
    String[] commands = {"1. go north", "2. go south", "3. go east",
        "4. go west", "5. help", "6. pick up item", "7. check inventory",
        "8. check stats", "9. use <item name>"};

    public String askForMove() {
        String input = sc.nextLine();
        return input;
    }

    public void intro() {
        System.out.println("Welcome to our game. Here you will walk through"
                + "\na maze consisting of a lot of rooms."
                + "\nAs of current you can only move to other rooms."
                + "\nGot difficulty? type \"help\" to get a list of commands"
                + "\n -----------------------------------------------------------------------------");
    }

    // all the command results, like the one below.
    public void inputError() {
        System.out.println("Error: Wrong input. Type \"help\" in "
                + "order to view possible commands");
    }

    public void help() {
        for (String string : commands) {
            System.out.println(string);
        }
    }

    public void quittingGame() {
        System.out.println("you quitter!");
    }

    public void winningGame() {
        System.out.println("You found the exit. You won!");
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
        System.out.println("You used " + item.getName() + "!");
    }
    
    public void noItem() {
        System.out.println("You dont have that item");
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

    
    // 
    public void validRoomChange(Boolean bool) {
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
}
