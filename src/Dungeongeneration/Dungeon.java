package Dungeongeneration;

import Items.Item;
import Items.Potion;
import Items.Weapon;
import Items.Armor;
import java.util.ArrayList;
import java.util.Random;

public class Dungeon {

    LookAndFeel laf = new LookAndFeel();
    ArrayList<Item> listOfItems = new ArrayList();
    ArrayList<Room> listOfRooms = new ArrayList();
    EnemyGeneration eg = new EnemyGeneration();
    Random random = new Random();

    public ArrayList enemies() {
        return eg.listOfEnemies;
    }

    public Room createMaze() {

        listOfItems.add(item1);
        listOfItems.add(item2);
        listOfItems.add(item3);
        listOfItems.add(item4);
        listOfItems.add(item5);
        listOfItems.add(item6);
        listOfItems.add(item7);
        listOfItems.add(item8);
        listOfItems.add(item9);
        listOfItems.add(item10);
        listOfItems.add(item11);
        listOfItems.add(item12);
        listOfItems.add(item13);
        listOfItems.add(item14);
        listOfItems.add(item16);
        listOfItems.add(item17);
        listOfItems.add(item18);
        listOfItems.add(item19);
        
        
        for (int i = 0; i < 18; i++) {
            int num = random.nextInt(3);
            if (num == 0) {
                listOfItems.add(new Weapon("" , laf.getRandomItemDesc(),random.nextInt()));
            }

            if (num == 1) {
                listOfItems.add(new Armor("", "", random.nextInt()));
            }

            if (num == 2) {
                listOfItems.add(new Potion("", "", random.nextInt()));
            }

        }

        Room startRoom = new Room("room1", laf.getDESC_0(), listOfItems.get(random.nextInt(listOfItems.size())));
        listOfRooms.add(startRoom);
        for (int i = 0; i < 18; i++) {
            listOfRooms.add(new Room("room" + String.valueOf(i),
                    laf.getRandomRoomDesc(), listOfItems.get(random.nextInt(18))));
        }
        Room bossRoom = new Room("", laf.getDESC_25(), item15);
        listOfRooms.add(bossRoom);

        //startroom
        listOfRooms.get(0).setSouth(listOfRooms.get(8));

        //room 1
        listOfRooms.get(1).setEast(listOfRooms.get(2));

        //room 2
        listOfRooms.get(2).setSouth(listOfRooms.get(4));
        listOfRooms.get(2).setWest(listOfRooms.get(1));

        //room 3
        listOfRooms.get(3).setSouth(listOfRooms.get(5));

        //room 4
        listOfRooms.get(4).setNorth(listOfRooms.get(2));
        listOfRooms.get(4).setSouth(listOfRooms.get(6));

        //room 6
        listOfRooms.get(5).setNorth(listOfRooms.get(3));
        listOfRooms.get(5).setSouth(listOfRooms.get(9));

        //room 7
        listOfRooms.get(6).setNorth(listOfRooms.get(4));
        listOfRooms.get(6).setEast(listOfRooms.get(7));

        //room 8
        listOfRooms.get(7).setWest(listOfRooms.get(6));
        listOfRooms.get(7).setEast(listOfRooms.get(8));

        //room 9
        listOfRooms.get(8).setNorth(listOfRooms.get(0));
        listOfRooms.get(8).setWest(listOfRooms.get(7));
        listOfRooms.get(8).setEast(listOfRooms.get(9));
        listOfRooms.get(8).setSouth(listOfRooms.get(12));

        //room 10
        listOfRooms.get(9).setNorth(listOfRooms.get(5));
        listOfRooms.get(9).setWest(listOfRooms.get(8));
        listOfRooms.get(9).setEast(listOfRooms.get(10));
        listOfRooms.get(9).setSouth(listOfRooms.get(13));

        //room 11
        listOfRooms.get(10).setWest(listOfRooms.get(9));
        listOfRooms.get(10).setSouth(listOfRooms.get(14));

        //room 12
        listOfRooms.get(11).setSouth(listOfRooms.get(15));

        //room 13
        listOfRooms.get(12).setNorth(listOfRooms.get(8));
        listOfRooms.get(12).setEast(listOfRooms.get(13));
        listOfRooms.get(12).setSouth(listOfRooms.get(16));

        //room 14
        listOfRooms.get(13).setNorth(listOfRooms.get(9));
        listOfRooms.get(13).setWest(listOfRooms.get(12));
        listOfRooms.get(13).setSouth(listOfRooms.get(17));

        //room 15
        listOfRooms.get(14).setNorth(listOfRooms.get(10));

        //room 16
        listOfRooms.get(15).setNorth(listOfRooms.get(11));
        listOfRooms.get(15).setEast(listOfRooms.get(16));
        listOfRooms.get(15).setSouth(listOfRooms.get(19));

        //room 17
        listOfRooms.get(16).setNorth(listOfRooms.get(12));
        listOfRooms.get(16).setWest(listOfRooms.get(15));

        //room 18
        listOfRooms.get(17).setNorth(listOfRooms.get(13));
        listOfRooms.get(17).setEast(listOfRooms.get(18));

        //room 19
        listOfRooms.get(18).setWest(listOfRooms.get(17));

        //room 20
        listOfRooms.get(19).setNorth(listOfRooms.get(15));

        eg.generate(listOfRooms);
        return startRoom;
    }

}
