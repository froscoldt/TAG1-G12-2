package tag1;

import java.util.ArrayList;
import tag1.maze.Room;
import tag2.items.Items;

public class PlayerDemo {

    private String name;
    private Room location;
    private int health;
    private int damage;
    private int armor;
    
    private static final int BASE_HEALTH = 100;
    private static final int BASE_DAMAGE = 5;
    private static final int BASE_ARMOR = 0;
    
    Inventory inventory = new Inventory();
    ArrayList items = new ArrayList();

    public PlayerDemo(String name, Room location) {
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

    public boolean goNorth() {
        if (location.getNorth() == null) {
            return false;
        } else {
            location = location.getNorth();
            return true;
        }
    }

    public boolean goEast() {
        if (location.getEast() == null) {
            return false;
        } else {
            location = location.getEast();
            return true;
        }
    }

    public boolean goSouth() {
        if (location.getSouth() == null) {
            return false;
        } else {
            location = location.getSouth();
            return true;
        }
    }

    public boolean goWest() {
        if (location.getWest() == null) {
            return false;
        } else {
            location = location.getWest();
            return true;
        }
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
