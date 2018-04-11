/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag1;

import java.util.Scanner;

/**
 *
 * @author Mark
 */
public class TUI {
    String[] help = {"1. go north", "2. go south", "3. go east", "4. go west", "5. help", "6. quit"};
    Scanner sc = new Scanner(System.in);

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
    public void error() {
        System.out.println("Error: Wrong input. Type \"help\" in "
                + "order to view possible commands");
    }
    public void noDirection() {
        System.out.println("No opening in that direction.");
    }
    public void help() {
        for (String string : help) {
            System.out.println(string);
        }
    }
    public void quit() {
        System.out.println("you quitter!");
    }
    
    public void winner() {
        System.out.println("You found the exit. You won!");
    }
    
    public void printString(String str) {
        System.out.println(str);
    
    }
    
    
    
}
