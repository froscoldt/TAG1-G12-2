package Items;

import Units.Unit;

public class Item {

    private String name,description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
    

    @Override
    public String toString() {
        return "Item: " + name + " - Desc: " + description;
    }
    
    

    public void use(Unit player) {}
    public void pickUp(Unit player) {}
   

}
