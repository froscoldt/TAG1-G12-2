package tag2.items;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Units.Unit;
import Dungeongeneration.Room;
import Items.Item;
import Items.Weapon;

public class WeaponTest {

    @Test
    public void testUseWeapon() {
        //arrange
        Unit player = new Unit("", null);
        Item item = new Weapon("name","desc", 10);
        int expectedDamageRes = 15;

        //act
        item.use(player);

        //assert
        assertEquals(expectedDamageRes, player.getDamage());
    }

}
