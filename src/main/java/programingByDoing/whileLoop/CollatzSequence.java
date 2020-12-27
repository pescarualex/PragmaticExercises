package programingByDoing.whileLoop;

import java.util.Scanner;

public class CollatzSequence {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Starting number: ");
        int n = keyboard.nextInt();
        int steps = 0, max = 0;

        do {
            System.out.print(n + "\t");
            steps++;

            if (steps % 10 == 0) {
                System.out.println();
            }

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }

            if (n > max) {
                max = n;
            }
        } while (n != 1);

        System.out.println(n);
        System.out.println("Terminated after " + steps + " steps\n" +
                "The largest value was " + max);



    }




}
