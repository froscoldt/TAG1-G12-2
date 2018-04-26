package Dungeongeneration;

import Items.Item;
import Items.Potion;
import Items.Weapon;
import Items.Armor;
import Units.Boss;
import Units.Enemy;
import Units.SmallEnemy;
import java.util.ArrayList;
import java.util.Random;

public class Dungeon {

    LookAndFeel laf = new LookAndFeel();
    ArrayList<Item> listOfItems = new ArrayList();
    ArrayList<Room> listOfRooms = new ArrayList();
    ArrayList<Enemy> listOfEnemies = new ArrayList();
    Random random = new Random();

    public ArrayList<Room> getListOfRooms() {
        return listOfRooms;
    }

    public ArrayList<Enemy> getListOfEnemies() {
        return listOfEnemies;
    }
    Enemy boss = null;

    public void generateEnemies(ArrayList<Room> room) {
        boss = new Boss("Ronnie", listOfRooms.get(19));
        for (int i = 0; i < 12; i++) {
            listOfEnemies.add(new SmallEnemy(laf.getRandomMonsterName(),
                    room.get(random.nextInt(room.size()))));
        }
        listOfEnemies.add(boss);
    }

    public Enemy getBoss() {
        return boss;
    }

    public Room createMaze() {

        for (int i = 0; i < 18; i++) {
            int num = random.nextInt(100);
            if (num < 41) {
                String[] weaponInfo = laf.getRandomItemInfo("weapon");
                listOfItems.add(new Weapon(
                        weaponInfo[0],
                        weaponInfo[1],
                        random.nextInt(10) + 6));
            }

            if (num >= 41 && num <= 70) {
                String[] armorInfo = laf.getRandomItemInfo("armor");
                listOfItems.add(new Armor(
                        armorInfo[0],
                        armorInfo[1],
                        random.nextInt(10) + 3));
            }

            if (num > 70) {
                String[] potionInfo = laf.getRandomItemInfo("potion");
                listOfItems.add(new Potion(
                        potionInfo[0],
                        potionInfo[1],
                        random.nextInt(10) + 20));
            }

        }

        Room startRoom = new Room("room1", laf.getDESC_0(), listOfItems.get(random.nextInt(listOfItems.size())));
        listOfRooms.add(startRoom);
        for (int i = 0; i < 18; i++) {
            listOfRooms.add(new Room("room" + String.valueOf(i),
                    laf.getRandomRoomDesc(), listOfItems.get(random.nextInt(18))));
        }
        Room bossRoom = new Room("", laf.getDESC_25(), null);

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

        generateEnemies(listOfRooms);
        return startRoom;
    }

}
