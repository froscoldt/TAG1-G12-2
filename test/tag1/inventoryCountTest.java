/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tag2.items.Item;
import tag2.items.Weapon;

/**
 *
 * @author Mark
 */
public class inventoryCountTest {
    
    @Test
    public void OneItemInInventoryTest() {
        //arrange
        Player player = new Player("", null);
        Item item = new Weapon("sword","desc", 10);

        //act
        item.pickUp(player);

        //assert
        assertEquals(1, player.backpack.size());
        
        
    }
    @Test
    public void multipleItemInInventoryTest() {
        //arrange
        Player player = new Player("", null);
        Item item = new Weapon("sword","desc", 10);
        Item item1 = new Weapon("dagger","desc", 5);
        Item item2 = new Weapon("shortsword","desc", 7);

        //act
        item.pickUp(player);
        item1.pickUp(player);
        item2.pickUp(player);

        //assert
        assertEquals(3, player.backpack.size());
        
    }
}
