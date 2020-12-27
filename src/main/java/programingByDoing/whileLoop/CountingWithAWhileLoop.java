package programingByDoing.whileLoop;

import java.util.Scanner;

public class CountingWithAWhileLoop {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
        System.out.println("How meny time to iterate?");
        int time = keyboard.nextInt();

        int n = 1;
        while (n <= time) {
            System.out.println((n) + ". " + message);
            n++;
        }

    }
}
