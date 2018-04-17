/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tag1.maze.Room;

/**
 *
 * @author Mads
 */
public class PlayerTest {

    Room start, south, southEast;
    
    @Before
    public void setup() {
        start = new Room("", "Start");
        south = new Room("", "South");
        southEast = new Room("", "SouthsEast");
        start.setSouth(south);
        south.setEast(southEast);
    }

    @Test
    public void createPlayer() {
        Player p = new Player("", 100, start);
        Room currentRoom = p.getLocation();
        assertEquals("Start", start.getDesc());
    }
    
    public void testGoSouth() {
        Player p = new Player("", 100, start);
        p.setLocation(south);
        //Metode i Controller skal forenkles i flere små metoder
        //ellers kan der ikke foretages test
        
    }
    
    public void testIfPlayerCanGoToRoom() {
        
    }
    
}
