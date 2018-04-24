package tag2.items;

import org.junit.Test;
import static org.junit.Assert.*;
import Units.Unit;
import Items.Item;
import Items.Weapon;
import Units.Player;

public class WeaponTest {

    @Test
    public void testUseWeapon() {
        //arrange
        Unit player = new Player("", null);
        Item item = new Weapon("name","desc", 10);
        int expectedDamageRes = 15;

        //act
        item.use((Player) player);

        //assert
        assertEquals(expectedDamageRes, player.getDamage());
    }

}
