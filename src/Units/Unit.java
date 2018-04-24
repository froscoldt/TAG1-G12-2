package Units;

import java.util.ArrayList;
import Dungeongeneration.Room;


public abstract class Unit {

    private String name;
    private Room location;

    public Unit(String name, Room location) {
        this.name = name;
        this.location = location;
        
    }

    public abstract String stats();

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

    public String getName() {
        return name;
    }


    public Room getLocation() {
        return location;
    }

    public abstract int getDamage();

    public abstract void setHealth(int health);

    public abstract void setDamage(int damage);

    public abstract void increaseHealth(int health);

    public abstract void increaseDamage(int damage);


}
