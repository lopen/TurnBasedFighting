/**
 * looks at the enemy.txt file and picks random enemies to populate the run through
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class EnemyGenerator {

    private ArrayList<Enemy> enemies;

    public EnemyGenerator(int numOfEnemies) throws Exception
    {
        enemies = new ArrayList<>();
        addRandomEnemies(numOfEnemies);
    }

    public void addRandomEnemies(int numOfEnemies) throws Exception
    {
        // all enemies
        ArrayList<Enemy> allEnemies = new ArrayList<>();

        // get all enemies from the file
        File file = new File("enemy.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String stringRead;
        while ((stringRead = br.readLine()) != null)
        {
            String[] enemy = stringRead.split(",");
            Enemy toAdd = new Enemy(enemy[0], enemy[1]);
            allEnemies.add(toAdd);
        }

        // select at random the numOfEnemies needed from the allEnemies list
        Random rand = new Random();
        for (int i = 0; i < numOfEnemies; i++)
        {
            enemies.add(allEnemies.get(rand.nextInt(allEnemies.size())));
        }
    }

    public ArrayList<Enemy> returnEnemies()
    {
        return enemies;
    }
}