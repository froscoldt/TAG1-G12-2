package tag2.items;

import tag1.Player;

public class Item {

    private String name,description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void use(Player player) {}
    public void pickUp(Player player) {}
    public void dropItem() {}
   

}
