
package tag1.maze;
public class Room {
    
    private String name,desc;
    private Room north, west, south, east;

    public String getName() {
        return name;
    }

    public Room(String name, String desc) {
        this.desc = desc;
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
