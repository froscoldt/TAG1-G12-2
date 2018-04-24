/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag3;

import Highscore.Highscore;
import Units.Player;
import Units.Unit;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Mads
 */
public class HighScoreTest {

    Highscore h = new Highscore();
    ArrayList<Highscore> arr = new ArrayList();
    Player p1 = null;
    Player p2 = null;
    Player p3 = null;

    @Before
    public void setup() {
        p1 = new Player("Mads", null);
        p2 = new Player("Mark", null);
        p3 = new Player("Damjan", null);
        p1.setScore(748);
        p2.setScore(1265);
        p3.setScore(492);
    }

    @Test
    public void testSize() {
        h.emptyHighsScoreFile();
        h.writeHighScoreToTable(new Highscore(p1));
        h.writeHighScoreToTable(new Highscore(p2));
        h.readHighScoreTable();
        arr = h.getHighScoreTable();
        assertEquals(2, arr.size());
    }

    @Test
    public void getHighScore() {
        h.emptyHighsScoreFile();
        h.writeHighScoreToTable(new Highscore(p1));
        h.writeHighScoreToTable(new Highscore(p2));
        h.writeHighScoreToTable(new Highscore(p3));
        h.readHighScoreTable();
        arr = h.getHighScoreTable();
        assertEquals("Mads", arr.get(0).getPlayer());
        assertEquals(1265, arr.get(1).getHighScore());
        assertEquals("Damjan", arr.get(2).getPlayer());
    }

    @Test
    public void testSorting() {
        h.emptyHighsScoreFile();
        h.writeHighScoreToTable(new Highscore(p1));
        h.writeHighScoreToTable(new Highscore(p2));
        h.writeHighScoreToTable(new Highscore(p3));
        arr = h.getHighScoreTable();
        h.setHighScoreTable(h.sortHighScore(arr));
        assertEquals("Mark", arr.get(0).getPlayer());
        assertEquals(1265, arr.get(0).getHighScore());
        assertEquals(748, arr.get(1).getHighScore());
    }
}
