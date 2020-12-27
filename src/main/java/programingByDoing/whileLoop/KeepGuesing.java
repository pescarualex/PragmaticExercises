package programingByDoing.whileLoop;

import java.util.Random;
import java.util.Scanner;

public class KeepGuesing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("I have chosen a number between 1 to 10. Try to guess it!\n" +
                "Your guess: ");
        int entry = sc.nextInt();

        Random r = new Random();
        int randomNum = r.nextInt(11);

        while (entry != randomNum) {
            System.out.println("Nope, guess again.");
            entry = sc.nextInt();

            if (entry == randomNum) {
                System.out.println("Good job, that's right!");
                System.exit(0);
            }
        }

    }

}
