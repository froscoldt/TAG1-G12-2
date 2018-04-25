package tag3;

import Highscore.Timescore;
import Units.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mads
 */
public class TimerTest {

    Timescore ts = null;
    Player p = new Player(null, null);

    @Test
    public void testTimer() throws InterruptedException {
        ts = new Timescore();
        Thread.sleep(2000);
        ts.endTimer();
        assertEquals(2, ts.getTimeUsed());
    }
    
    @Test
    public void testScores() throws InterruptedException {
        ts = new Timescore();
        Thread.sleep(2000);
        ts.endTimer();
        ts.setScoreBasedOnTime(p);
        assertEquals(500, ts.getScore());
        assertEquals(500, p.getScore());
    }
}
