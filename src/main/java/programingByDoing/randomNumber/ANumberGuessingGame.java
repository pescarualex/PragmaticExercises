package programingByDoing.randomNumber;

import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("I'm thinking of a number from 1 to 10.\n" +
                "Your guess: ");
        int guess = sc.nextInt();

        Random r = new Random();
        int num = 1 + r.nextInt(10);

        if (guess == num) {
            System.out.println("That's right! My secret number was " + num);
        } else {
            System.out.println("Sorry, but I was really thinking of " + num);
        }


    }




}
