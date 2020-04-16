import java.util.Scanner;
import java.util.ArrayList;

/**
 * Parser class, takes input from player, prints initial message and has all command methods.
 *
 * @Author Trygve
 */
public class Parser {

    private Scanner scan;
    private ArrayList<String> commands;

    public Parser()
    {
        scan = new Scanner(System.in);
        commands = new ArrayList<>();
        commands.add("quit");
        commands.add("attack");
        commands.add("go");
        commands.add("help");
    }

    public void initialInfo(Hero player)
    {
        System.out.println("Hello!\nPlease type using only lower case.\nUse the command 'help' to see the other commands.\n");

        System.out.println("Please enter your name: ");
        System.out.print(">");
        player.setName(scan.nextLine());

        System.out.println("Please enter your age: ");
        System.out.print(">");
        player.setAge(scan.nextInt());
    }

    public void takeInput()
    {
        System.out.print(">");
        String input = scan.nextLine();
        if (commands.contains(input.split(" ")[0]))
        {
            switch(input.split(" ")[0])
            {
                case "quit":
                    quit();
                    break;
                case "attack":
                    attack();
                    break;
                case "go":
                    go();
                    break;
                case "help":
                    help();
                    break;
            }
        }
    }

    public void quit()
    {
        System.out.println("Thanks for playing!");
        System.exit(0);
    }
    
    public void attack()
    {
        System.out.println("You attack!");
    }

    public void go()
    {
        System.out.println("Going into combat!");
        //start combat scenario
    }

    public void help()
    {
        String allCommands = "The commands are: ";
        for (String str : commands)
        {
            allCommands += str + "; ";
        }

        System.out.println(allCommands);
    }
}