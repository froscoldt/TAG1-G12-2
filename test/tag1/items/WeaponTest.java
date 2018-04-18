package tag1.items;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tag1.Player;
import tag1.maze.Room;
import tag2.items.Items;
import tag2.items.Weapon;

public class WeaponTest {

    @Test
    public void testUseWeapon() {
        //arrange
        Player player = new Player("", null);
        Items item = new Weapon("", 10);
        int expectedDamageRes = 15;

        //act
        item.use(player);

        //assert
        assertEquals(expectedDamageRes, player.getDamage());
    }

}
