/**
 * Kind of not needed, will probably remove later on.
 */
public enum Commands
{
    QUIT("quit"), 
    ATTACK("attack"), 
    GO("go"), 
    HELP("help");

    private String name;

    Commands(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
}