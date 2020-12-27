package programingByDoing.whileLoop.doWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("I have chosen a number between 1 and 10.  Try to guess it.\n" +
                "Your guess: ");
        int guess = sc.nextInt();

        Random r = new Random();
        int num = r.nextInt(10);
        int count = 1;

        do {
            System.out.println("Nope, try again.");
            guess = sc.nextInt();
            count++;

            if (guess == num) {
                System.out.println("Well done, congrats! It only took you " + count + " tries.");
                System.exit(0);

            }
        } while (guess != num);


    }


}
