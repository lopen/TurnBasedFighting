import java.util.Random;
/**
 * Player superclass, contains the health, attack and defense stats of the current instance
 * of a class that extends Player. Also has a field that specifies if the instance is alive or not.
 *
 * @Author Trygve
 */
public class Player {

    /**
     * Protected fields that can be accessed by subclasses
     */
    protected int HEALTH = 100;
    protected boolean ALIVE = true;  
    protected int ATTACK = 1; 
    protected int DEFENSE = 0;

    //Random :)
    private Random random;

    /**
     * Attack method
     * @return
     */
    public int attack()
    {
        return ATTACK * random.nextInt(11);
    }

    public int heal()
    {
        return 0;
    }

    public void setHEALTH(int hp)
    {
        HEALTH = hp;
    }

    public void addHEALTH(int hp)
    {
        HEALTH += hp;
    }

    public void setATTACK(int attack)
    {
        ATTACK = attack;
    }

    public void setDEFENSE(int def)
    {
        DEFENSE = def;
    }

    public int getHEALTH()
    {
        return HEALTH;
    }

    public boolean isALIVE()
    {
        return ALIVE;
    }

    public int getATTACK()
    {
        return ATTACK;
    }

    public int getDEFENSE()
    {
        return DEFENSE;
    }
}