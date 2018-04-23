package Units;

import java.util.Random;

public class SmallEnemy extends Enemy {

    private Random random = new Random();
    private int addRandomHealth = 0 - random.nextInt(15) - 10;
    // adds health of -10 to 5 
    private int addRandomDamage = random.nextInt(10) - 5;
    // adds damage of -5 to 5 
    

    public SmallEnemy(String name, String description, int health, int damage) {
        super(name, description, health, damage);
        health += addRandomHealth;
        damage += addRandomDamage;
    }

    
    
    
}
