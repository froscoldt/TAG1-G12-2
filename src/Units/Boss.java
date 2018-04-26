package Units;

import Dungeongeneration.Room;
import java.util.Random;

public class Boss extends Enemy {

    private int health;
    private static final int BASE_HEALTH = 200;

    private int damage;
    private static final int BASE_DAMAGE = 15;

    private Random random = new Random();

    private final int addRandomHealth = 0 + random.nextInt(15) + 10;
    // adds health of 10 to 25 
    private final int addRandomDamage = random.nextInt(10) - 5;
    // adds damage of -5 to 5 

    public Boss(String name, Room location) {
        super(name, location);
        damage = BASE_DAMAGE + addRandomDamage;
        health = BASE_HEALTH + addRandomHealth;
    }

    // public String 
    @Override
    public String stats() {
        return "Damage: " + getDamage() + " Health: " + health;

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

    @Override
    public void increaseHealth(int health) {
        this.health += health;
    }

    @Override
    public void increaseDamage(int damage) {
        this.damage += damage;
    }

    @Override
    public void attack(Player player) {
        player.decreaseHealth(this.damage);

    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void decreaseHealth(int health) {
        this.health -= health;
    }

    @Override
    public boolean isDead() {
       return this.health <= 0;
        
    }

}
