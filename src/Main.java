import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObjScanner = new Scanner(System.in);  // Create a Scanner object

        //Random number variable
        Random rand = new Random();
        int iRandomNumber = rand.nextInt(0,100);

        //Decision making loop until usser guess right number
        System.out.println("Guess the number between 0 and 100");
        boolean flag = false;
        int iGuess = 0;
        do
        {
            String sGuess = myObjScanner.nextLine();  // Read user input
            iGuess = Integer.parseInt(sGuess);

            if(iRandomNumber == iGuess)
            {
                System.out.println("You guessed the right number!");
            }
            else if (iRandomNumber < iGuess)
            {
                System.out.println("You guessed too high, guess again!");
            }
            else
            {
                System.out.println("You guessed too low, guess again!");
            }
        }
        while(!flag);
    }
}