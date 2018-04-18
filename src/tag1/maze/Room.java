
package tag1.maze;

import tag2.items.Item;

public class Room {
    
    private String name,desc;
    private Room north, west, south, east;
    private Item roomItem;

    public String getName() {
        return name;
    }

    public Room(String name, String desc, Item item) {
        this.desc = desc;
        this.roomItem = item;
    }

    public void setRoomItem(Item roomItem) {
        this.roomItem = roomItem;
    }

    public Item getRoomItem() {
        return roomItem;
    }
    
    public void setNorth(Room north) {
        this.north = north;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getNorth() {
        return north;
    }

    public Room getWest() {
        return west;
    }

    public Room getSouth() {
        return south;
    }

    public Room getEast() {
        return east;
    }

    public String getDesc() {
        return desc;
    }
    
    
}
