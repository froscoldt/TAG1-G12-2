package Units;

import Dungeongeneration.Room;
import java.util.Random;

public class SmallEnemy extends Enemy {

    private int health;
    private static final int BASE_HEALTH = 100;

    private int damage;
    private static final int BASE_DAMAGE = 5;

    private Random random = new Random();
    private final int addRandomHealth = 0 - random.nextInt(20) - 10;
    // adds health of -10 to 5 
    private final int addRandomDamage = random.nextInt(10) - 5;
    // adds damage of -5 to 5 

    public SmallEnemy(String name, Room location) {
        super(name, location);

        damage = BASE_DAMAGE + addRandomDamage;
        health = BASE_HEALTH + addRandomHealth;
    }

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
    public int getHealth() {
        return health;
    }

    public void decreaseHealth(int damage) {
        this.health -= damage;
    }

    public void attack(Player player) {
        if (this.damage - player.getArmor() / 10 < 0 ) {
           return;
        }
        player.decreaseHealth(this.damage - (player.getArmor() / 10));
//        System.out.println(player.getArmor());
//        System.out.println(player.getArmor() / 10);
//        System.out.println((player.getArmor() / 10) + this.damage);
    }

    @Override
    public boolean isDead() {
        return this.health <= 0;

    }

}
