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
    ArrayList backpack = new ArrayList();
    Item[] equip = new Item[1];

    public Player(String name, Room location) {
        this.name = name;
        this.location = location;
        damage = BASE_DAMAGE;
        health = BASE_HEALTH;
        armor = BASE_ARMOR;
        // equip[0] = null; i tilfælde af at default værdien i et array ikke er null
    }

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
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

    public void equipWeapon(Item item) {
        /*  
        
        "if no weapon is equipped
        if (equip[0] == null){
            equip[0] = item;
        }
        else {
        "if a weapon is equipped, replace it with this one"
            equip[0] = item;
            "and some code to remove the damage the weapon added to the player."
        }
            
        
        
         */
    }
}
