package tag2.items;

import tag1.Player;
import tag1.maze.Room;

public class Items {

    private String name;
    private Room location;

    public Items(String name) {
        this.name = name;
    }

    public void use(Player player) {
        //player.addItemToBackPack(this);
    
    }
    
    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public void pickUp() {
        // pick up
    }

    public void drop() {
        // drop it
    }

    public String getName() {
        return name;
    }

}
