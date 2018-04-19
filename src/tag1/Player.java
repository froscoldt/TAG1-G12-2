package tag1;

import java.util.ArrayList;
import tag1.maze.Room;
import tag2.items.Item;

public class Player {

    private String name;
    private Room location;

    private int health;
    private static final int BASE_HEALTH = 100;

    private int damage;
    private static final int BASE_DAMAGE = 5;

    private int armor;
    private static final int BASE_ARMOR = 0;
    ArrayList<Item> backpack = new ArrayList();
    public Player(String name, Room location) {
        this.name = name;
        this.location = location;
        damage = BASE_DAMAGE;
        health = BASE_HEALTH;
        armor = BASE_ARMOR;
    }

    public boolean use(int slot) {
        if (backpack.get(slot) == null) return false; 
        backpack.get(slot).use(this);
        backpack.set(slot, null);
        return true;
    }
    
    public boolean goNorth() {
        if (location.getNorth() == null) {
            return false;
        }
        location = location.getNorth();
        getLocation().getDesc();
        return true;
    }

    public boolean goEast() {
        if (location.getEast() == null) {
            return false;
        }
        location = location.getEast();
        getLocation().getDesc();
        return true;
    }

    public boolean goSouth() {
        if (location.getSouth() == null) {
            return false;
        }
        location = location.getSouth();
        getLocation().getDesc();
        return true;
    }

    public boolean goWest() {
        if (location.getWest() == null) {
            return false;
        }
        location = location.getWest();
        getLocation().getDesc();
        return true;
    }

    public Room getLocation() {
        return location;
    }

    public ArrayList<Item> getBackpack() {
        return backpack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void increaseHealth(int health) {
        this.health += health;
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

    public void decreaseDamage(int damage) {
        this.damage -= damage;
    }

    public void increaseArmor(int armor) {
        this.armor += armor;
    }

    public void addItemToInventory(Item item) {
        backpack.add(item);
    }

}
