package tag1;

import tag1.maze.Room;


public class Player {
    private String name;
    private int health;
    private Room location;

    public Player(String name, int health, Room location) {
        this.name = name;
        this.health = health;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    
    
    
    
}
