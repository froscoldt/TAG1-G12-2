package tag2.items;

import tag1.Player;

public class Potion extends Items {

    private int healing;

    public Potion(String name, int healing) {
        super(name);
        this.healing = healing;

    }

    public void use(Player player) {
        player.increaseHealth(healing);
    }

}
