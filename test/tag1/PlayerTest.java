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
        start = new Room("", "Start", null);
        south = new Room("", "South", null);
        southEast = new Room("", "SouthsEast", null);
        start.setSouth(south);
        south.setEast(southEast);
    }

    @Test
    public void createPlayer() {
        Player p = new Player("", start);
        Room currentRoom = p.getLocation();
        assertEquals("Start", start.getDesc());
    }

    @Test
    public void testControllerForMove() {
        Player p = new Player("", start);
        Controller c = new Controller();
        c.awaitingAnswer(p);
        assertEquals("South", p.getLocation().getDesc());
    }

}
