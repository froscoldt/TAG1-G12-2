package tag1;

import java.util.ArrayList;
import tag1.maze.Room;
import tag2.items.Items;

public class Player {

    private String name;
    private Room location;
    
    private int health;
    private static final int BASE_HEALTH = 100;
    
    private int damage;
    private static final int BASE_DAMAGE = 5;
    
    private int armor;
    private static final int BASE_ARMOR = 0;
    Inventory inventory = new Inventory();
    ArrayList items = new ArrayList();

    public Player(String name, Room location) {
        this.name = name;
        this.health = health;
        this.location = location;
        damage = BASE_DAMAGE;
        health = BASE_HEALTH;
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

    public void increaseHealth(int health) {
        this.health += health;
    }

    public void pickUpItem(Items i) {
        ArrayList arr = new ArrayList();
        arr = inventory.getInventory();
        arr.add(i);
        inventory.setInventory(arr);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void increaseDamage(int damage) {
        this.damage += damage;
    }

    public void increaseArmor(int armor) {
        
    }

}
