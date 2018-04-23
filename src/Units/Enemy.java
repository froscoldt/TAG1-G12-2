package Units;
public class Enemy {
   
    private String name, description;
    private int health, damage;
    

    public Enemy(String name, String description, int health, int damage) {
        this.name = name;
        this.description = description;
        this.health = health;
    }

    public void attack() {}
    public void move() {}
    
    
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }
    
    
    
    
}
