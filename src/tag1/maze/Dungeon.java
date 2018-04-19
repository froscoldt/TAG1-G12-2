package tag1.maze;

import java.util.Random;
import tag1.LookAndFeel;
import tag2.items.Item;
import tag2.items.Potion;
import tag2.items.Weapon;
import tag2.items.Armor;

public class Dungeon {

    LookAndFeel laf = new LookAndFeel();
  
Item[] items = new Item[3];

    public Room createMaze() {
        Item item = new Weapon("Dwarf forged dagger","This item was forged in the dark mines of Milenia",5);
        Item item1 = new Weapon("Elven forged dagger","This items was forged in woods of Taloor",5);
        Item item2 = new Potion("Pony milk health potion","Healthy milk with alot of vitamins",20);
        Item item3 = new Armor("Leather Leggins","Tailored in the slums of Valoor",15);
        Item item4 = new Armor("Leather Helmet","Tailored in the slums of Valoor",10);
        Item item5 = new Weapon("Sword of fire","This sword was forged in the fires of Milenia",10);
        Item item6 = new Armor("Wooden Shield","A lightweight shield, forged by the water golems at the lake of the green woods",15);
        Item item7 = new Potion("Water","Forfreshing water",0);
        Item item8 = new Weapon("Elven Bow","Forged in the woods of Taloor",20);
        Item item9 = new Armor("Dark Breastplate","This breastplate was destroyed and reforged by the dark dwarfs, in the darkmines",25);
        Item item10 = new Weapon("Bow of the elder winds","Forged by the people of the winds, this bow is not just powerful, but also really handy to carry",35);
        Item item11 = new Potion("Potion of life","This yellow potion, heals you up from the death",100);
        Item item12 = new Weapon("Sharp dagger","This light fellor is so painful, that you cant even imagine",25);
        Item item13 = new Armor("Boots of steel","Boots of steel was forged in the the mines of Taloor, by the underground elven people",25);
        Item item14 = new Potion("Green potion","Do not drink",-10);
        Item item15 = new Weapon("Legendary Sword","A sword with unbelieveable power and damage",40);
        Item item16 = new Armor("Leggins of steel","The Leggins of steel was forged in the the mines of Taloor, by the underground elven people",35);
        Item item17 = new Potion("Red Potion","Heals you for 50% of your current health",50);
        Item item18 = new Armor("Helmet of steel","Helmet of steel was forged in the the mines of Taloor, by the underground elven people",25);
        Item item19 = new Weapon("Icy Dagger","Forged in the deathlands in the north",30);


        Room room1 = new Room("room1", laf.getRandomDesc(), item1);
        Room room2 = new Room("room2", laf.getRandomDesc(), item2);
        Room room3 = new Room("room3", laf.getRandomDesc(), item3);
        Room room4 = new Room("room4", laf.getRandomDesc(), item4);
        Room startRoom = new Room("room5", laf.getDESC_0(), item);
        Room room6 = new Room("room6", laf.getRandomDesc(), item5);
        Room room7 = new Room("room7", laf.getRandomDesc(), item6);
        Room room8 = new Room("room8", laf.getRandomDesc(), item7);
        Room room9 = new Room("room9", laf.getRandomDesc(), item8);
        Room room10 = new Room("room10", laf.getRandomDesc(), item9);
        Room room11 = new Room("room11", laf.getRandomDesc(), item10);
        Room room12 = new Room("room12", laf.getRandomDesc(), item11);
        Room room13 = new Room("room13", laf.getRandomDesc(), item12);
        Room room14 = new Room("room14", laf.getRandomDesc(), item13);
        Room room15 = new Room("room15", laf.getRandomDesc(), item14);
        Room room16 = new Room("room16", laf.getRandomDesc(), item15);
        Room room17 = new Room("room17", laf.getRandomDesc(), item16);
        Room room18 = new Room("room18", laf.getRandomDesc(), item17);
        Room room19 = new Room("room19", laf.getRandomDesc(), item18);
        Room room20 = new Room("room20", laf.getDESC_25(), item19);

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
