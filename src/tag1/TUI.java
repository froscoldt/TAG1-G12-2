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
    String[] help = {"1. go north", "2. go south", "3. go east", "4. go west", };
    Scanner sc = new Scanner(System.in);

    public String askForMove() {
        String input = sc.nextLine();
        return input;
    }

    
    public void intro() {
        System.out.println("Welcome to our game. Here you will walk through"
                + "a maze consisting of a lot of rooms."
                + "As of current ");
    }
    
    // all the command results, like the one below.
    public void error() {
        System.out.println("Error: Wrong input. Type \"help\" in "
                + "order to view possible commands");
    }
    public void help() {
        System.out.println("1go north");
        System.out.println("help text!");
        System.out.println("help text!");
        System.out.println("help text!");
    }
    public void quit() {
        System.out.println("you quitter!");
    }
    
    
    
}
