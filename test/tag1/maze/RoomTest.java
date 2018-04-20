/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag1.maze;

import Dungeongeneration.Room;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mads
 */
public class RoomTest {

    @Test
    public void testSetSouthRoom() {
        Room start = new Room("", "Start", null);
        Room south = new Room("", "South", null);
        start.setSouth(south);
        assertEquals("South", start.getSouth().getDesc());
    }

    @Test
    public void testSetNorthRoom() {
        Room start = new Room("", "Start", null);
        Room north = new Room("", "North", null);
        start.setNorth(north);
        assertEquals("North", start.getNorth().getDesc());
    }

    @Test
    public void testSetEastRoom() {
        Room start = new Room("", "Start", null);
        Room east = new Room("", "East", null);
        start.setEast(east);
        assertEquals("East", start.getEast().getDesc());
    }

    @Test
    public void testSetWestRoom() {
        Room start = new Room("", "Start", null);
        Room west = new Room("", "West", null);
        start.setWest(west);
        assertEquals("West", start.getWest().getDesc());
    }
    
    @Test
    public void getSouthsSouth() {
        Room start = new Room("", "Start", null);
        Room south = new Room("", "South", null);
        Room southsSouth = new Room("", "SouthsSouth", null);
        start.setSouth(south);
        south.setSouth(southsSouth);
        assertEquals("Start", start.getDesc());
        assertEquals("South", start.getSouth().getDesc());
        assertEquals("SouthsSouth", start.getSouth().getSouth().getDesc());
        
    }
}
