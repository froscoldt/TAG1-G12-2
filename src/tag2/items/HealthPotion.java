package tag2.items;

import tag1.Player;

public class HealthPotion extends Items {

    private final int HEAL = 20;

    @Override
    public void pickUp() {
    }


    public void use(Player p) {
        p.setHealth(p.getHealth() + HEAL);
        getDescription();
    }

    public void getDescription() {
        System.out.println("You gained " + HEAL + " health");
    }
}
