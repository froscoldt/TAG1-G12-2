/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2.items;

import tag1.Player;

/**
 *
 * @author Mark
 */
public class Armor extends Item {

    private int armor;

    public Armor(String name, String description, int armor) {
        super(name, description);
        this.armor = armor;

    }

    public void use(Player player) {
        player.increaseArmor(armor);
    }

}
