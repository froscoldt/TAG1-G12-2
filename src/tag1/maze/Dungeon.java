package tag1.maze;

import tag1.maze.Room;
import java.util.ArrayList;
import tag1.LookAndFeel;
import tag1.Player;

public class Dungeon {
    LookAndFeel laf = new LookAndFeel();
    
    public Room createMaze() {

        Room room1 = new Room(laf.getRandomDesc());
        Room room2 = new Room(laf.getRandomDesc());
        Room room3 = new Room(laf.getRandomDesc());
        Room room4 = new Room(laf.getRandomDesc());
        Room startRoom = new Room("");
        Room room6 = new Room(laf.getRandomDesc());
        Room room7 = new Room(laf.getRandomDesc());
        Room room8 = new Room(laf.getRandomDesc());
        Room room9 = new Room(laf.getRandomDesc());
        Room room10 = new Room(laf.getRandomDesc());
        Room room11 = new Room(laf.getRandomDesc());
        Room room12 = new Room(laf.getRandomDesc());
        Room room13 = new Room(laf.getRandomDesc());
        Room room14 = new Room(laf.getRandomDesc());
        Room room15 = new Room(laf.getRandomDesc());
        Room room16 = new Room(laf.getRandomDesc());
        Room room17 = new Room(laf.getRandomDesc());
        Room room18 = new Room(laf.getRandomDesc());
        Room room19 = new Room(laf.getRandomDesc());
        Room room20 = new Room(laf.getRandomDesc());

        // room 1
        room1.setEast(room2);

        // room 2
        room2.setSouth(room4);

        // room 3
        room3.setSouth(room6);

        // room 4
        room4.setSouth(room7);

        // room 5 start room
        startRoom.setSouth(room9);

        // room 6
        room6.setNorth(room3);
        room6.setSouth(room10);

        // room 7
        room7.setNorth(room4);
        room7.setEast(room8);

        // room 8
        room8.setWest(room7);
        room8.setEast(room9);

        // room 9
        room9.setEast(room10);
        room9.setNorth(startRoom);
        room9.setWest(room8);
        room9.setSouth(room13);

        // room 10
        room10.setEast(room11);
        room10.setNorth(room6);
        room10.setWest(room9);
        room10.setSouth(room14);

        // room 11
        room11.setWest(room10);
        room11.setSouth(room15);

        // room 12
        room12.setSouth(room16);

        // room 13
        room13.setEast(room14);
        room13.setNorth(room9);
        room13.setSouth(room17);

        // room 14
        room14.setNorth(room10);
        room14.setSouth(room18);
        room14.setWest(room13);

        // room 15
        room15.setNorth(room11);

        // room 16
        room16.setNorth(room12);
        room16.setEast(room17);
        room16.setSouth(room20);

        // room 17
        room17.setNorth(room13);
        room17.setWest(room16);

        // room 18
        room18.setNorth(room14);
        room18.setEast(room19);

        // room 19
        room19.setWest(room18);

        // room 20
        room20.setNorth(room16);
        
        return startRoom;
    }
}
