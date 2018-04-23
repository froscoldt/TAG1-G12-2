package Items;

import Units.Unit;

public class Potion extends Item {

    private int healing;

    public Potion(String name, String description, int healing) {
        super(name, description);
        this.healing = healing;
    }


    @Override
    public void use(Unit player) {
        player.increaseHealth(healing);
    }


    @Override
    public void pickUp(Unit player) {
        player.addItemToInventory(this);
    }


}
