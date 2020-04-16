/**
 * Enemy class, subclass of Player
 * This is the base enemy class, with a name and description of the enemy.
 * @Author Trygve
 */
public class Enemy extends Player{

    private String name;
    private String description;

    public Enemy(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public String getLongDescription()
    {
        return "There is a " + getName() + " in this room. " + getDescription() + ". It leaps towards you!";
    }
}