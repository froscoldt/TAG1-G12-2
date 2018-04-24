package Dungeongeneration;

import Items.Armor;
import Items.Item;
import Items.Potion;
import Items.Weapon;
import java.util.Random;

public class LookAndFeel {

    Random random = new Random();
    private final String DESC_ROOM_0 = "You got no idea how you got here, there seems only to be one entrance - this place seems erie";
    private final String DESC_ROOM_1 = "A dim bluish light suffuses this chamber, its source obvious at a glance.\nBlue-glowing lichen and violet-glowing moss cling to the ceiling and spread across the floor";
    private final String DESC_ROOM_2 = "A crack in the ceiling above the middle of the north wall allows a trickle\nof water to flow down to the floor. The water pools near the base of the wall, and a rivulet runs along the wall an out into the hall.";
    private final String DESC_ROOM_3 = "This small chamber seems divided into three parts. The first has several\nhooks on the walls from which hang dusty robes. An open curtain separates that space from the next, which has a dry basin set in the floor.";
    private final String DESC_ROOM_4 = "Burning torches in iron sconces line the walls of this room, lighting it brilliantly.\nAt the room's center lies a squat stone altar, its top covered in recently spilled blood.";
    private final String DESC_ROOM_5 = "Unlike the flagstone common throughout the dungeon, this room is walled and\nfloored with black marble veined with white. The ceiling is similarly marbled, but the thick pillars that hold it up are white.\nA brown stain drips down one side of a nearby pillar.";
    private final String DESC_ROOM_6 = "This otherwise bare room has one distinguishing feature. \nThe stone around one of the other doors has been pulled over its edges, as though the rock were as soft as clay and could be moved with fingers.";
    private final String DESC_ROOM_7 = "A 30-foot-tall demonic idol dominates this room of black stone.\nThe potbellied statue is made of red stone, and its grinning face holds what looks to be two large rubies in place of eyes.";
    private final String DESC_ROOM_8 = "You open the door, and the reek of garbage assaults your nose.\nLooking inside, you see a pile of refuse and offal that nearly reaches the ceiling.\nIn the ceiling above it is a small hole that is roughly as wide as two human hands.";
    private final String DESC_ROOM_9 = "This chamber of well-laid stones holds a wide bas-relief of a pastoral scene.";
    private final String DESC_ROOM_10 = "There's a hiss as you open this door, and you smell a sour odor, \nlike something rotten or fermented. Inside you see a small room lined with dusty shelves, crates, and barrels.";
    private final String DESC_ROOM_11 = "This narrow room at first appears to be a dead-end corridor, \nbut then you note several metal plates on the walls set at about eye height.";
    private final String DESC_ROOM_12 = "The strong, sour-sweet scent of vinegar assaults your nose as you enter this room. \nSundered casks and broken bottle glass line the walls of this room.";
    private final String DESC_ROOM_13 = "A horrendous, overwhelming stench wafts from the room before you. \nSmall cages containing small animals and large insects line the walls. ";
    private final String DESC_ROOM_14 = "You open the door, and the room comes alive with light and music. \nA sourceless, warm glow suffuses the chamber, and a harp you cannot see plays soothing sounds";
    private final String DESC_ROOM_15 = "The burble of water reaches your ears after you open the door to this room. \nYou see the source of the noise in the far wall.";
    private final String DESC_ROOM_16 = "Fire crackles and pops in a small cooking fire set in the center of the room. \nThe smoke from a burning rat on a spit curls up through a hole in the ceiling.";
    private final String DESC_ROOM_17 = "This tiny room holds a curious array of machinery. \nWinches and levers project from every wall, and chains with handles dangle from the ceiling. ";
    private final String DESC_ROOM_18 = "The door creaks open, which somewhat overshadows the sound of bubbling liquid.";
    private final String DESC_ROOM_19 = "A chill wind blows against you as you open the door. \nBeyond it, you see that the floor and ceiling are nothing but iron grates.";
    private final String DESC_ROOM_20 = "Many small desks with high-backed chairs stand in three long rows in this room. \nEach desk has an inkwell, book stand, and a partially melted candle in a rusting tin candleholder.";
    private final String DESC_ROOM_21 = "This room holds six dry circular basins large enough to hold a man and a dry fountain at its center. \nAll possess chipped carvings of merfolk and other sea creatures.";
    private final String DESC_ROOM_22 = "A strange ceiling is the focal point of the room before you. \nIt's honeycombed with hundreds of holes about as wide as your head.";
    private final String DESC_ROOM_23 = "Water rushes down from several holes in the ceiling, and each hole is roughly a foot wide. \nThe water pours in columns that fall through similar holes in the floor, \nflowing down to some unknown depth.";
    private final String DESC_ROOM_24 = "You find this chamber lit dimly by guttering candles that squat in small hills of melted wax.";
    private final String DESC_ROOM_25 = "You feel uneasy...";

    private final String[] DESC_ITEM_WEAPON_0 = {"Dwarf forged dagger", "This item was forged in the dark mines of Milenia"};
    private final String[] DESC_ITEM_WEAPON_1 = {"Elven forged dagger", "This items was forged in woods of Taloor"};
    private final String[] DESC_ITEM_WEAPON_2 = {"Sword of fire", "This sword was forged in the fires of Milenia"};
    private final String[] DESC_ITEM_WEAPON_3 = {"Elven Bow", "Forged in the woods of Taloor"};
    private final String[] DESC_ITEM_WEAPON_4 = {"Bow of the elder winds", "Forged by the people of the winds,\n this bow is not just powerful, but also really handy to carry"};
    private final String[] DESC_ITEM_WEAPON_5 = {"Sharp dagger", "This light fellor is so painful, that you cant even imagine"};
    private final String[] DESC_ITEM_WEAPON_6 = {"Legendary Sword", "A sword with unbelieveable power and damage"};
    private final String[] DESC_ITEM_WEAPON_7 = {"Icy Dagger", "Forged in the deathlands in the north"};
   
    private final String[] DESC_ITEM_ARMOR_0 = {"Leather Leggins", "Tailored in the slums of Valoor"};
    private final String[] DESC_ITEM_ARMOR_1 = {"Leather Helmet", "Tailored in the slums of Valoor"};
    private final String[] DESC_ITEM_ARMOR_2 = {"Wooden Shield", "A lightweight shield, forged by\n the water golems at the lake of the green woods"  };
    private final String[] DESC_ITEM_ARMOR_3 = {"Dark Breastplate", "This breastplate was destroyed and\n reforged by the dark dwarfs, in the darkmines"};
    private final String[] DESC_ITEM_ARMOR_4 = {"Boots of steel", "Boots of steel was forged in the the\n mines of Taloor, by the underground elven people"};
    private final String[] DESC_ITEM_ARMOR_5 = {"Leggins of steel", "The Leggins of steel was forged in\n the the mines of Taloor, by the underground elven people"};
    private final String[] DESC_ITEM_ARMOR_6 = {"Helmet of steel", "Helmet of steel was forged in the mines of Taloor,\n by the underground elven people"};

    private final String[] DESC_ITEM_POTION_0 = {"Pony milk health potion", "Healthy milk with alot of vitamins"};
    private final String[] DESC_ITEM_POTION_1 = {"Water", "Forfreshing water"};
    private final String[] DESC_ITEM_POTION_2 = {"Potion of life", "This yellow potion, heals you up from the death"};
    private final String[] DESC_ITEM_POTION_3 = {"Green potion", "The green color feels uncomfortable"};
    private final String[] DESC_ITEM_POTION_4 = {"Red Potion", "Is it blood?"};

    public String getDESC_0() {
        return DESC_ROOM_0;
    }

    public String getDESC_25() {
        return DESC_ROOM_25;
    }

    private String[] roomDescriptions = {
        DESC_ROOM_1, DESC_ROOM_2, DESC_ROOM_3, DESC_ROOM_4, DESC_ROOM_5,
        DESC_ROOM_6, DESC_ROOM_7, DESC_ROOM_8, DESC_ROOM_9, DESC_ROOM_10,
        DESC_ROOM_11, DESC_ROOM_12, DESC_ROOM_13, DESC_ROOM_14, DESC_ROOM_15,
        DESC_ROOM_16, DESC_ROOM_17, DESC_ROOM_18, DESC_ROOM_19, DESC_ROOM_20,
        DESC_ROOM_21, DESC_ROOM_22, DESC_ROOM_23, DESC_ROOM_24};

    private String[] itemWeaponInfo [] = {
        DESC_ITEM_WEAPON_0, DESC_ITEM_WEAPON_1, 
        DESC_ITEM_WEAPON_2, DESC_ITEM_WEAPON_3, 
        DESC_ITEM_WEAPON_4, DESC_ITEM_WEAPON_5, 
        DESC_ITEM_WEAPON_6, DESC_ITEM_WEAPON_7};

    private String[] itemArmorInfo [] = {
        DESC_ITEM_ARMOR_0, DESC_ITEM_ARMOR_1, 
        DESC_ITEM_ARMOR_2, DESC_ITEM_ARMOR_3, 
        DESC_ITEM_ARMOR_4, DESC_ITEM_ARMOR_5, 
        DESC_ITEM_ARMOR_6};

    private String[] itemPotionInfo [] = {
        DESC_ITEM_POTION_0, DESC_ITEM_POTION_1, 
        DESC_ITEM_POTION_2, DESC_ITEM_POTION_3, 
        DESC_ITEM_POTION_4};
   

    public String[] getRoomDescriptions() {
        return roomDescriptions;
    }

    public String getRandomRoomDesc() {
        return roomDescriptions[random.nextInt(24)];

    }

    
    
    
    public String[] getRandomItemInfo(String item) {
        if (item.equalsIgnoreCase("weapon")) {
            int num = random.nextInt(itemWeaponInfo.length);
            return itemWeaponInfo[num];
        }
        if (item.equalsIgnoreCase("potion")) {
            int num = random.nextInt(itemPotionInfo.length);
            return itemPotionInfo[num];
        }
        if (item.equalsIgnoreCase("armor")) {
            int num = random.nextInt(itemArmorInfo.length);
            return itemArmorInfo[num];
        }
        return null;
    }


}
