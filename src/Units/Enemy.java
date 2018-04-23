package Units;

import Dungeongeneration.Room;

public abstract class Enemy extends Unit {

    public Enemy(String name, String description, Room location) {
        super(name, description, location);

    }
}
