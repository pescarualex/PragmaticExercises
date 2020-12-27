package pragmaticExercises.repetition;

import java.util.Scanner;

public class AddingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int x;
            int i;
            int total = 0;

        for (i = 1; i <= 5; i++) {
            System.out.println("Enter a number:");
            x = sc.nextInt();
            total += x;
        }

        System.out.println("The total is " + total);

    }

}
