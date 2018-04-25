package Maingame;

public class ActionConverter {

    public Action whatAction(String str) {
        if (str.startsWith("go")) {
            return convertMove(str.toLowerCase());
        }

        return convert(str.toLowerCase());
    }

    public Action convert(String str) {
        if (str.equalsIgnoreCase("pick up item")) {
            return Action.pickUp;
        } else if (str.equalsIgnoreCase("check inventory")) {
            return Action.checkInventory;
        } else if (str.contains("use ")) {
            return Action.use;
        } else if (str.equalsIgnoreCase("check stats")) {
            return Action.checkStats;
        } else if (str.contains("attack ")) {
            return Action.attack;
        } else {
            return null;
        }
    }

    public Action convertMove(String str) {
        if (str.equalsIgnoreCase("go north")) {
            return Action.GoNorth;
        } else if (str.equalsIgnoreCase("go south")) {
            return Action.GoSouth;
        } else if (str.equalsIgnoreCase("go east")) {
            return Action.GoEast;
        } else if (str.equalsIgnoreCase("go west")) {
            return Action.GoWest;
        } else {
            return null;
        }

    }

}
