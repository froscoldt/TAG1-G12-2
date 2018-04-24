/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag3;

import Highscore.Highscore;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mads
 */
public class HighScoreTest {

    Highscore h = new Highscore();
    ArrayList<Highscore> arr = new ArrayList();

    @Test
    public void testSize() {
        h.emptyHighsScoreFile();
        h.writeHighScoreToTable(new Highscore("Mark", 1253));
        h.writeHighScoreToTable(new Highscore("Mads", 748));
        h.readHighScoreTable();
        arr = h.getHighScoreTable();
        assertEquals(2, arr.size());
    }

    @Test
    public void getHighScore() {
        h.emptyHighsScoreFile();
        h.writeHighScoreToTable(new Highscore("Mark", 1253));
        h.writeHighScoreToTable(new Highscore("Mads", 748));
        h.writeHighScoreToTable(new Highscore("Damjan", 1689));
        h.readHighScoreTable();
        arr = h.getHighScoreTable();
        assertEquals("Mark", arr.get(0).getPlayer());
        assertEquals(748, arr.get(1).getHighScore());
        assertEquals("Damjan", arr.get(2).getPlayer());
    }

    @Test
    public void testSorting() {
        h.emptyHighsScoreFile();
        h.writeHighScoreToTable(new Highscore("Mark", 1253));
        h.writeHighScoreToTable(new Highscore("Mads", 748));
        h.writeHighScoreToTable(new Highscore("Damjan", 1689));
        arr = h.getHighScoreTable();
        h.setHighScoreTable(h.sortHighScore(arr));
        assertEquals("Damjan", arr.get(0).getPlayer());
        assertEquals(1689, arr.get(0).getHighScore());
        assertEquals(1253, arr.get(1).getHighScore());
    }
}
