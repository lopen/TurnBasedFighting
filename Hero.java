/**
 * Hero class, the player, a subclass of Player.
 *
 * @Author Trygve
 */
public class Hero extends Player{

    // name of the player
    private String name;
    // age of the player
    private int age;

    /**
     * Constructor
     */
    public Hero(){}

    /**
     * Setter for name field.
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Setter for age field.
     * @param age
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * Getter for name field.
     * @return name field
     */
    public String getName()
    {
        return name;
    }

    /**
     * Getter for age field.
     * @return age field
     */
    public int getAge()
    {
        return age;
    }

    /**
     * toString method returns the name and age of the player separated by a comma.
     * @return string name, age
     */
    public String toString()
    {
        return getName() + ", " + getAge();
    }
}