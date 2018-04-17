/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2.items;

import tag1.maze.Room;

/**
 *
 * @author Mark
 */
public abstract class Items {

    private String name;
    private Room location;

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public void pickUp() {
        
    }

    public abstract void use();

    public void drop() {
        // drop it
    }

}
