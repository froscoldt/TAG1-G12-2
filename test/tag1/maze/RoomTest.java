/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag1.maze;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mads
 */
public class RoomTest {

    @Test
    public void testSetSouthRoom() {
        Room start = new Room("", "Start");
        Room south = new Room("", "South");
        start.setSouth(south);
        assertEquals("South", start.getSouth().getDesc());
    }

    @Test
    public void testSetNorthRoom() {
        Room start = new Room("", "Start");
        Room north = new Room("", "North");
        start.setNorth(north);
        assertEquals("North", start.getNorth().getDesc());
    }

    @Test
    public void testSetEastRoom() {
        Room start = new Room("", "Start");
        Room east = new Room("", "East");
        start.setEast(east);
        assertEquals("East", start.getEast().getDesc());
    }

    @Test
    public void testSetWestRoom() {
        Room start = new Room("", "Start");
        Room west = new Room("", "West");
        start.setWest(west);
        assertEquals("West", start.getWest().getDesc());
    }
    
    @Test
    public void getSouthsSouth() {
        Room start = new Room("", "Start");
        Room south = new Room("", "South");
        Room southsSouth = new Room("", "SouthsSouth");
        start.setSouth(south);
        south.setSouth(southsSouth);
        assertEquals("Start", start.getDesc());
        assertEquals("South", start.getSouth().getDesc());
        assertEquals("SouthsSouth", start.getSouth().getSouth().getDesc());
        
    }
}
