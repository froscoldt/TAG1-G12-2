package tag1;

public class ActionConverter {

    public Action convert(String str) {

        if (str.equalsIgnoreCase("go north")) {
            return Action.GoNorth;
        } else if (str.equalsIgnoreCase("go south")) {
            return Action.GoSouth;
        } else if (str.equalsIgnoreCase("go east")) {
            return Action.GoEast;
        } else if (str.equalsIgnoreCase("go west")) {
            return Action.GoWest;
        } else if (str.equalsIgnoreCase("pick up item")) {
            return Action.pickUp;
        } else if (str.equalsIgnoreCase("check inventory")) {
            return Action.checkInventory;
        } else if (str.equalsIgnoreCase("check inventory")) {
            return Action.use;
        } else {
            return null;
        }
        
        
    }

}
