package programingByDoing.whileLoop;

import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = keyboard.nextInt();

        double sqrt = Math.sqrt(input);
        System.out.println("The square root of " + input + " is " + sqrt);

        while (input < 0) {
            System.out.println("You can't take the square of a negative number, silly.\n" +
                    "Try again: ");
            input = keyboard.nextInt();
            double root = Math.sqrt(input);
            System.out.println("The square root of " + input + " is " + root);

        }


    }
}
