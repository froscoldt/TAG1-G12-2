package Items;

import Units.Player;

public class Potion extends Item {

    private int healing;

    public Potion(String name, String description, int healing) {
        super(name, description);
        this.healing = healing;
    }

    public int getHealing() {
        return healing;
    }


    @Override
    public void use(Player player) {
        player.increaseHealth(healing);
    }


    @Override
    public void pickUp(Player player) {
        player.addItemToInventory(this);
    }


}
