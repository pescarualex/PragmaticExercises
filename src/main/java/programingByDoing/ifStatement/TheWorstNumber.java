package programingByDoing.ifStatement;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class TheWorstNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("I'm thinking of a number from 1-10. Guess it!");
        int guessTheNum = sc.nextInt();

        int num = ThreadLocalRandom.current().nextInt(1, 10);

        if (guessTheNum != num) {
            System.out.println("LOL! You are sucks! The number is " + num);
        } else {
            System.out.println("You got it! The number is " + num);
        }


    }
}
