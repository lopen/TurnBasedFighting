/**
 * looks at the enemy.txt file and picks random enemies to populate the run through
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class EnemyGenerator {

    // ArrayList field of all enemies
    private ArrayList<Enemy> enemies;

    /**
     * Constructor for EnemyGenerator
     * @throws Exception
     */
    public EnemyGenerator() throws Exception
    {
        enemies = new ArrayList<>();
    }

    /**
     * addRandomEnemies metod, adds random enemies taken from the enemy.txt file
     * @param numOfEnemies, the amount of enemies in the game instance
     * @throws Exception
     */
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

    /**
     * Getter method for the enemies field
     * @return
     */
    public ArrayList<Enemy> getEnemies()
    {
        return enemies;
    }

    /**
     * Prints enemies' names and description separated by a comma.
     */
    public void printEnemies()
    {
        for (Enemy enemy : enemies)
        {
            System.out.println(enemy.getName() + ", " + enemy.getDescription());
        }
    }
}