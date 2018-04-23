package Dungeongeneration;

import Units.Enemy;
import Units.SmallEnemy;
import java.util.ArrayList;
import java.util.Random;

public class EnemyGeneration {
    Random random = new Random();
    ArrayList<Enemy> listOfEnemies = new ArrayList();

    public void generate(ArrayList<Room> room) {
        for (int i = 0; i < 10; i++) {
            listOfEnemies.add(new SmallEnemy("RandomZombieName", 
                    "RandomZombieDescription", room.get(random.nextInt(room.size()))));
        }
    }

    public ArrayList<Enemy> getListOfEnemies() {
        return listOfEnemies;
    }
    
    
    

}
