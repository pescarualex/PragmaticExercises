package programingByDoing.whileLoop;

import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1-100.\n" +
                "You have 7 guesses to guess the number");
        int countTries = 1;

        Random r = new Random();
        int num = r.nextInt(100);

        int numOfTries = 7;

        System.out.println("Guess #" + countTries + ": ");
        int guess = sc.nextInt();

        while (guess != num && countTries <= numOfTries) {
            countTries++;

            if (guess < num) {
                System.out.println("To low");
                System.out.println("Guess #" + countTries + ": ");
                guess = sc.nextInt();
            } else if (guess > num){
                System.out.println("To high");
                System.out.println("Guess #" + countTries + ": ");
                guess = sc.nextInt();
            } else if (countTries == numOfTries) {
                System.out.println("Sorry, you didn't guess it in 7 tries. You lose!");
            }

        }

        if (guess == num) {
            System.out.println("You guess it!");
        }
    }


}
