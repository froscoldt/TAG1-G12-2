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
        PlayerDemo p = new PlayerDemo("", start);
        Room currentRoom = p.getLocation();
        assertEquals("Start", start.getDesc());
    }
    
    @Test
    public void testGoSouth() {
        PlayerDemo p = new PlayerDemo("", start);
        boolean result = p.goSouth();
        assertTrue(result);
    }
    
    @Test
    public void testIfPlayerCanGoToRoom() {
        PlayerDemo p = new PlayerDemo("", start);
        boolean result = p.goEast();
        assertFalse(result);
    }
    
    @Test
    public void testControllerForMove() {
        PlayerDemo p = new PlayerDemo("", start);
        Controller c = new Controller();
        c.move(p, "go south");
        assertEquals("South", p.getLocation().getDesc());
    }
    
}
