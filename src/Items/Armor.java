package Items;

import Units.Unit;

public class Armor extends Item {

    private int armor;

    public Armor(String name, String description, int armor) {
        super(name, description);
        this.armor = armor;

    }

    @Override
    public void use(Unit player) {
        player.increaseArmor(armor);
    }

    @Override
    public void pickUp(Unit player) {
        player.addItemToInventory(this);
    }

}
