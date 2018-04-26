package Items;

import Units.Player;

public class Weapon extends Item {

    private int damage;

    public Weapon(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }



    @Override
    public void use(Player player) {
        player.increaseDamage(damage);
        // overstående println bliver ikke skrevet til output - denne metode bliver ikke brugt?
    }

    @Override
    public void pickUp(Player player) {
        player.addItemToInventory(this);
    }

}
