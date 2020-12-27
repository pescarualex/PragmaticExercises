package programingByDoing.randomNumber;

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1-100. Try to guess it!\n" +
                ">");

        Random r = new Random();

        int num = 1 + r.nextInt(100);

        int guess = sc.nextInt();

        if (guess < num) {
            System.out.println("Sorry, you are to low. I was thinking of " + num);
        } else if (guess > num) {
            System.out.println("Sorry, you are to hight. I was thinking of " + num);
        } else {
            System.out.println("You guessed it! What are the odds?");

        }


    }


}
