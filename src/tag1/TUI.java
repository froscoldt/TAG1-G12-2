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

    Scanner sc = new Scanner(System.in);

    public String askForMove() {
        String input = sc.nextLine();
        return input;
    }

    
    
    
    // all the command results, like the one below.
    public void error() {
        System.out.println("Error: Wrong input. Type \"help\" in "
                + "order to view possible commands");
    }
    
    
    
}
