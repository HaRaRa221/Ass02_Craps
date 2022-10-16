import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void roll(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        boolean donePlay = true;
        int diceRoll1=rnd.nextInt(6) + 1;
        int diceRoll2=rnd.nextInt(6) + 1;
        int crapsRolls= diceRoll1 + diceRoll2;
        int thePoint = crapsRolls;

        do {
            if (crapsRolls == 2 || crapsRolls == 3 || crapsRolls == 12)
            {
                System.out.println("You crapped out. You lose!");
            }
            else if (crapsRolls == 7 || crapsRolls == 11)
            {
                System.out.println("You are naturally good. You win!");
            }
            else {
                System.out.println("The point you got is " + crapsRolls + ". " + "That is your point.");
                crapsRolls = thePoint;
            }

            while(crapsRolls != 7 && crapsRolls != thePoint)
            {
                if (crapsRolls == thePoint) {

                }
            }
        }
        while (!donePlay);
    }
}