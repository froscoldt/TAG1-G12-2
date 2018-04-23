package Maingame;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Highscore implements Serializable {
    
    private int highScore;
    private String player;
    private ArrayList<Highscore> highScoreTable = new ArrayList();
    private final String HIGHSCOREFILE = "highscore.txt";

    public int getHighScore() {
        return highScore;
    }

    public String getPlayer() {
        return player;
    }

    public void setHighScore(int highScore) {
        this.highScore += highScore;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
    
    public void writeHighScoreToTable(Highscore highSco) {
        this.highScoreTable = readHighScoreTable();
        highScoreTable.add(highSco);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(HIGHSCOREFILE));
            oos.writeObject(highScoreTable);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList readHighScoreTable() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(HIGHSCOREFILE));
            this.highScoreTable = (ArrayList) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return highScoreTable;
    }
    
    
    
}
