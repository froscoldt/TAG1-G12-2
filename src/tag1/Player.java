package tag1;

import java.util.ArrayList;
import tag1.maze.Room;
import tag2.items.Items;


public class Player {
    private String name;
    private int health;
    private Room location;
    
    Inventory inventory = new Inventory();

    public Player(String name, int health, Room location) {
        this.name = name;
        this.health = health;
        this.location = location;
    }
    
    public Room getLocation() {
        return location;      
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    public void pickUpItem(Items i) {
        ArrayList arr = new ArrayList();
        arr = inventory.getInventory();
        arr.add(i);
        inventory.setInventory(arr);
    }
    
    
    
    
    
}
