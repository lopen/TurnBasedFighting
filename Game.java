import java.util.ArrayList;

/**
 * Game class, contains game loop and determines the number of enemies.
 *
 * @Author Trygve
 */
public class Game {

    // the player
    private Hero player;
    // all enemies in the game
    private ArrayList<Enemy> enemies;
    // instance of Parser class meant to take input from player
    private Parser inputHandler;

    /**
     * Constructor for Game class.
     * @param numOfEnemies, the number of enemies in the specific game instance.
     */
    public Game(int numOfEnemies) throws Exception
    {
        // populate the enemies arraylist with random enemies
        EnemyGenerator enGen = new EnemyGenerator();
        enGen.addRandomEnemies(numOfEnemies);
        enemies = enGen.getEnemies();
        // new Hero instance, the player
        player = new Hero();
        // create new parser to use in the game
        inputHandler = new Parser();
        inputHandler.initialInfo(player);
        // start game loop
        gameLoop();
    }

    /**
     * gameLoop method, while this is being called the game is still playing.
     */
    public void gameLoop()
    {
        //do game
        inputHandler.takeInput();
        gameLoop();
    }
}