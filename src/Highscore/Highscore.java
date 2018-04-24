package Highscore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;

public class Highscore {
    
    private String player;
    private int highScore;
    private ArrayList<Highscore> highScoreTable = new ArrayList();
    private final String HIGHSCOREFILE = "highscore.txt";

    public Highscore() {
    }

    public Highscore(String player, int highScore) {
        this.player = player;
        this.highScore = highScore;
    }    

    public int getHighScore() {
        return highScore;
    }

    public String getPlayer() {
        return player;
    }

    public void setHighScore(int highScore) {
        this.highScore += highScore;
    }

    public ArrayList<Highscore> getHighScoreTable() {
        return highScoreTable;
    }

    public void setHighScoreTable(ArrayList<Highscore> highScoreTable) {
        this.highScoreTable = highScoreTable;
    }
    
    public void writeHighScoreToTable(Highscore highSco) {
        readHighScoreTable();
        highScoreTable.add(highSco);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(HIGHSCOREFILE));
            oos.writeObject(highScoreTable);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void readHighScoreTable() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(HIGHSCOREFILE));
            this.highScoreTable = (ArrayList) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void emptyHighsScoreFile() {
        try {
            new FileOutputStream(HIGHSCOREFILE).close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }    

    public ArrayList sortHighScore(ArrayList arr) {
        arr.sort(Comparator.comparing(Highscore::getHighScore).reversed());
        return arr;
    }
}
