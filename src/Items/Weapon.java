package Items;

import Units.Unit;

public class Weapon extends Item {

    private int damage;

    public Weapon(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }


    @Override
    public void use(Unit player) {
        player.increaseDamage(damage);
    }

    @Override
    public void pickUp(Unit player) {
        player.addItemToInventory(this);
    }

}
