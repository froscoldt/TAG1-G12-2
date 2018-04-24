package Units;

import Dungeongeneration.Room;
import java.util.Random;

public abstract class Enemy extends Unit {

    private Room location;
    Random random = new Random();

    public Enemy(String name, Room location) {
        super(name, location);
        this.location = location;
    }
    public abstract String getHealth();
    
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

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }
}
