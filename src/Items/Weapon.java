package Items;

import Maingame.Player;

public class Weapon extends Item {

    private int damage;

    public Weapon(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }


    @Override
    public void use(Player player) {
        player.increaseDamage(damage);
    }

    @Override
    public void pickUp(Player player) {
        player.addItemToInventory(this);
    }

}
