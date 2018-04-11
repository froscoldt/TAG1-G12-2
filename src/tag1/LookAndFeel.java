
package tag1;

import java.util.Random;

public class LookAndFeel {
    
    Random random = new Random();
    private final String DESC_0 = "You got no idea how you got here, there seems only to be one entrance - to the south.";
    private final String DESC_1 = "A dim bluish light suffuses this chamber, its source obvious at a glance.\nBlue-glowing lichen and violet-glowing moss cling to the ceiling and spread across the floor";
    private final String DESC_2 = "A crack in the ceiling above the middle of the north wall allows a trickle\nof water to flow down to the floor. The water pools near the base of the wall, and a rivulet runs along the wall an out into the hall.";
    private final String DESC_3 = "This small chamber seems divided into three parts. The first has several\nhooks on the walls from which hang dusty robes. An open curtain separates that space from the next, which has a dry basin set in the floor.";
    private final String DESC_4 = "Burning torches in iron sconces line the walls of this room, lighting it brilliantly.\nAt the room's center lies a squat stone altar, its top covered in recently spilled blood.";
    private final String DESC_5 = "Unlike the flagstone common throughout the dungeon, this room is walled and\nfloored with black marble veined with white. The ceiling is similarly marbled, but the thick pillars that hold it up are white.\nA brown stain drips down one side of a nearby pillar.";
    private final String DESC_6 = "This otherwise bare room has one distinguishing feature. \nThe stone around one of the other doors has been pulled over its edges, as though the rock were as soft as clay and could be moved with fingers.";
    private final String DESC_7 = "A 30-foot-tall demonic idol dominates this room of black stone.\nThe potbellied statue is made of red stone, and its grinning face holds what looks to be two large rubies in place of eyes.";
    private final String DESC_8 = "You open the door, and the reek of garbage assaults your nose.\nLooking inside, you see a pile of refuse and offal that nearly reaches the ceiling.\nIn the ceiling above it is a small hole that is roughly as wide as two human hands.";
    private final String DESC_9 = "This chamber of well-laid stones holds a wide bas-relief of a pastoral scene.";
    private final String DESC_10 = "There's a hiss as you open this door, and you smell a sour odor, \nlike something rotten or fermented. Inside you see a small room lined with dusty shelves, crates, and barrels.";
    private final String DESC_11 = "This narrow room at first appears to be a dead-end corridor, \nbut then you note several metal plates on the walls set at about eye height.";
    private final String DESC_12 = "The strong, sour-sweet scent of vinegar assaults your nose as you enter this room. \nSundered casks and broken bottle glass line the walls of this room.";
    private final String DESC_13 = "A horrendous, overwhelming stench wafts from the room before you. \nSmall cages containing small animals and large insects line the walls. ";
    private final String DESC_14 = "You open the door, and the room comes alive with light and music. \nA sourceless, warm glow suffuses the chamber, and a harp you cannot see plays soothing sounds";
    private final String DESC_15 = "The burble of water reaches your ears after you open the door to this room. \nYou see the source of the noise in the far wall.";
    private final String DESC_16 = "Fire crackles and pops in a small cooking fire set in the center of the room. \nThe smoke from a burning rat on a spit curls up through a hole in the ceiling.";
    private final String DESC_17 = "This tiny room holds a curious array of machinery. \nWinches and levers project from every wall, and chains with handles dangle from the ceiling. ";
    private final String DESC_18 = "The door creaks open, which somewhat overshadows the sound of bubbling liquid.";
    private final String DESC_19 = "A chill wind blows against you as you open the door. \nBeyond it, you see that the floor and ceiling are nothing but iron grates.";
    private final String DESC_20 = "Many small desks with high-backed chairs stand in three long rows in this room. \nEach desk has an inkwell, book stand, and a partially melted candle in a rusting tin candleholder.";
    private final String DESC_21 = "This room holds six dry circular basins large enough to hold a man and a dry fountain at its center. \nAll possess chipped carvings of merfolk and other sea creatures.";
    private final String DESC_22 = "A strange ceiling is the focal point of the room before you. \nIt's honeycombed with hundreds of holes about as wide as your head.";
    private final String DESC_23 = "Water rushes down from several holes in the ceiling, and each hole is roughly a foot wide. \nThe water pours in columns that fall through similar holes in the floor, \nflowing down to some unknown depth.";
    private final String DESC_24 = "You find this chamber lit dimly by guttering candles that squat in small hills of melted wax.";
    private final String DESC_25 = "You seem to have found the exit";

    public String getDESC_0() {
        return DESC_0;
    }

    public String getDESC_25() {
        return DESC_25;
    }
    
    private String[] descriptions = {DESC_1,DESC_2,DESC_3,DESC_4,DESC_5,
                                     DESC_6,DESC_7,DESC_8,DESC_9,DESC_10,
                                     DESC_11,DESC_12,DESC_13,DESC_14,DESC_15,
                                     DESC_16,DESC_17,DESC_18,DESC_19,DESC_20,
                                     DESC_21,DESC_22,DESC_23,DESC_24,DESC_25};

    public String[] getDescriptions() {
        return descriptions;
    }
    
    public String getRandomDesc() {
        return descriptions[random.nextInt(25)];
        
    }
    
}
