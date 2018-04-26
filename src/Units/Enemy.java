package Units;

import Dungeongeneration.Room;
import java.util.Random;

public abstract class Enemy extends Unit {

    private Room location;
    private String name;
    private boolean attack = false;
    Random random = new Random();

    public Enemy(String name, Room location) {
        super(name, location);
        this.location = location;
        this.name = name;
    }

    public abstract int getHealth();

    public void move() {
        Room[] directions = {
            location.getEast(),
            location.getNorth(),
            location.getSouth(),
            location.getWest()};
        Room tryMove = directions[random.nextInt(4)];
        while (tryMove == null) {
            tryMove = directions[random.nextInt(4)];
        }
        setLocation(tryMove);
    }

    public boolean checkAttack() {
        if (isAttack() == false) {
            setAttack(true);
            return false;
        } else {
            return true;
        }
    }

    public int getMobScore(Enemy enemy) {
        if (enemy instanceof SmallEnemy) return 25;
        if (enemy instanceof Boss) return 150;
        return 0;
        
    }
    
    public abstract boolean isDead();
    
    public abstract void attack(Player player);

    public boolean isAttack() {
        return attack;
    }

    public void setAttack(boolean attack) {
        this.attack = attack;
    }

    @Override
    public Room getLocation() {
        return location;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setLocation(Room location) {
        this.location = location;
    }
}
