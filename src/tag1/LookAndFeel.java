
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
    private final String DESC_9 = "";
    private final String DESC_10 = "";
    private final String DESC_11 = "";
    private final String DESC_12 = "";
    private final String DESC_13 = "";
    private final String DESC_14 = "";
    private final String DESC_15 = "";
    private final String DESC_16 = "";
    private final String DESC_17 = "";
    private final String DESC_18 = "";
    private final String DESC_19 = "";
    private final String DESC_20 = "";
    private final String DESC_21 = "";
    private final String DESC_22 = "";
    private final String DESC_23 = "";
    private final String DESC_24 = "";
    private final String DESC_25 = "You seem to found the exit";

    public String getDESC_0() {
        return DESC_0;
    }

    public String getDESC_25() {
        return DESC_25;
    }
    
    private String[] descriptions = {DESC_1,DESC_2,DESC_3,DESC_4,DESC_5,DESC_6,DESC_7,DESC_8,DESC_9,DESC_10,DESC_11,DESC_12,DESC_13,DESC_14,DESC_15,DESC_16,DESC_17,DESC_18,DESC_19,DESC_20,DESC_21,DESC_22,DESC_23,DESC_24,DESC_25};

    public String[] getDescriptions() {
        return descriptions;
    }
    
    public String getRandomDesc() {
        return descriptions[random.nextInt(25)];
        
    }
    
}
