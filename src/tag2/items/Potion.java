package tag2.items;

import tag1.Player;

public class Potion extends Item {

    private int healing;

    public Potion(String name, String description, int healing) {
        super(name, description);
        this.healing = healing;

    }

    public void use(Player player) {
        player.increaseHealth(healing);
    }

}
