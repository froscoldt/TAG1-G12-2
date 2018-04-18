package tag2.items;

import tag1.Player;

public class Weapon extends Item {

    private int damage;

    public Weapon(String name, int damage) {
        super(name);
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
