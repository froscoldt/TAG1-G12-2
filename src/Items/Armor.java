package Items;

import Units.Player;

public class Armor extends Item {

    private int armor;

    public Armor(String name, String description, int armor) {
        super(name, description);
        this.armor = armor;

    }

    @Override
    public void use(Player player) {
        player.increaseArmor(armor);
    }

    @Override
    public void pickUp(Player player) {
        player.addItemToInventory(this);
    }

}
