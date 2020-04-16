/**
 * Enemy class, subclass of Player
 * This is the base enemy class, with a name and description of the enemy.
 * @Author Trygve
 */
public class Enemy extends Player{

    // name field of the enemy
    private String name;
    // description field of the enemy
    private String description;

    /**
     * Constructor for the Enemy class
     * @param name, the name of the enemy
     * @param description, the description of the enemy
     */
    public Enemy(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    /**
     * Getter method for description field.
     * @return description field
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Getter method for name field.
     * @return name field
     */
    public String getName()
    {
        return name;
    }

    /**
     * Get a long description of the enemy, meant to be printed once the
     * enemy has been encountered.
     * @return There is a X in this room Y. It leaps towards you!
     */
    public String getLongDescription()
    {
        return "There is a " + getName() + " in this room. " + getDescription() + ". It leaps towards you!";
    }
}