/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag1;

import Units.Unit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Dungeongeneration.Room;

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
        Unit p = new Unit("", start);
        Room currentRoom = p.getLocation();
        assertEquals("Start", start.getDesc());
    }

    @Test
    public void testIfPlayerCanMove() {
        Unit p = new Unit("", start);
        boolean goSouth = p.goSouth();
        boolean goWest = p.goWest();
        assertTrue(goSouth);
        assertFalse(goWest);
    }

}
