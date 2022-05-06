import java.io.InputStream;
import java.util.Scanner;

public class DragonCave {
        public static void main(String[]args){

                Scanner input = new Scanner(System.in);

        System.out.println("You are in a land full of dragons. In front of you, you see two caves");
        System.out.println("In one cave, the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");

        String userInput = input.nextLine();

        if (userInput.equals("1") || userInput.equals("2")){
                if(userInput.equals("1")) {
                        System.out.println("You approach the cave...");
                        System.out.println("It is dark and spooky...");
                        System.out.println("A large dragon jumps out in front of you! He opens his jaw and...");
                        System.out.println("Gobbles you down in one bite!");
                }
                else {
                        System.out.println("You approach the cave...");
                        System.out.println("It is dark but at the end you see something shimmer and move...");
                        System.out.println("A big crimson dragon appears and you realize the shimmer was its " +
                                "armor like scales reflecting light.");
                        System.out.println("The dragon looks and you and finally speaks being thankful for finally " +
                                "having some company because all creatures are too afraid to approach his cave.");
                }
        }
        else {
                System.out.println("You need to enter 1 or 2 to proceed");

        }


        }
}