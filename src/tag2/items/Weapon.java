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
public class Weapon extends Items {

    private int damage;

    public Weapon(String name, int damage) {
        super(name);
        this.damage = damage;

    }

    public void use(Player player) {
        player.increaseDamage(damage);
    }
    
    public void pickup(player) {
        
    }

}
