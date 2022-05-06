import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int userGuess;
            int count = 1;
            int ourNum = rand.nextInt(1,21);
            String userName;
            String tryAgain;

            System.out.println("Hello! what is your name their friend? =^) ");
            userName = input.nextLine();

            System.out.printf("Well, %s, I am thinking of a number between 1 and 20.", userName);
            System.out.println("You have 6 chances to figure it out... Take a guess.");
            userGuess = input.nextInt();

            while (userGuess != ourNum && count < 7) {

                if(userGuess > ourNum){
                    System.out.println("Your guess is too high.");
                    System.out.println("Try again.");
                }
                else {
                    System.out.println("Your guess is too low.");
                    System.out.println("Try again.");
                }

                userGuess = input.nextInt();
                count++;
            }

            System.out.printf("Good job, %s! You guessed my number in %s guesses!\n", userName, count);
            System.out.println("Would you like to play again? (y or n)");
            tryAgain = input.next();

            if(tryAgain.equals("n")){
                playAgain = false;
            }

        }

    }
}
