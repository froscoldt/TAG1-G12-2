package Units;

import Dungeongeneration.Room;
import Items.Item;
import java.util.ArrayList;

public class Player extends Unit {

    ArrayList<Item> backpack = new ArrayList();

    private int score = 0;

    private int health;
    private static final int BASE_HEALTH = 100;

    private int damage;
    private static final int BASE_DAMAGE = 5;

    private int armor;
    private static final int BASE_ARMOR = 0;

    public Player(String name, Room location) {
        super(name, location);
        damage = BASE_DAMAGE;
        health = BASE_HEALTH;
        armor = BASE_ARMOR;

    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return super.getName() + " " + this.score;
    }

    public boolean use(int slot) {
        if (backpack.get(slot) == null) {
            return false;
        }
        backpack.get(slot).use(this);
        backpack.set(slot, null);
        return true;
    }

    public ArrayList<Item> getBackpack() {
        return backpack;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int score) {
        this.score += score;
    }

    public void addItemToInventory(Item item) {
        backpack.add(item);
    }

    @Override
    public String stats() {
        return "Damage: " + getDamage() + " - Armor: " + armor + " - Items in backpack: " + backpack.size();
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public void increaseHealth(int health) {
        this.health += health;
    }

    @Override
    public void increaseDamage(int damage) {
        this.damage += damage;
    }

    public void increaseArmor(int armor) {
        this.armor += armor;
    }

    @Override
    public void decreaseHealth(int damage) {
        this.health -= damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

}
