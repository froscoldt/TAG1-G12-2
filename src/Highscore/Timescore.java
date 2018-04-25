/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Highscore;

import Units.Player;
import static java.lang.System.currentTimeMillis;

/**
 *
 * @author Mads
 */
public class Timescore {

    private long startTime;
    private long endTime;
    private int timeUsed;
    private int score;

    public Timescore() {
        this.startTime = currentTimeMillis();
    }

    public void endTimer() {
        this.endTime = currentTimeMillis();
        this.timeUsed = (int) (endTime - startTime) / 1000;
    }

    public int getTimeUsed() {
        return timeUsed;
    }

    public int getScore() {
        return score;
    }

    public void setScoreBasedOnTime(Player p) {
        if (this.timeUsed <= 360) {
            this.score = 500;
        }
        if (this.timeUsed >= 361 && this.timeUsed <= 480) {
            this.score = 250;
        }
        if (this.timeUsed >= 481 && this.timeUsed <= 600) {
            this.score = 100;
        }
        p.addToScore(this.score);
    }
}
