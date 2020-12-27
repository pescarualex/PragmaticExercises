package programingByDoing.whileLoop;

import java.util.Scanner;

public class AddingValueInALoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("I will add up the number you give me.\n" +
                "Number: ");
        int num = sc.nextInt();
        int total = 0;
        total += num;
        System.out.println("The total so far is " + total);

        while (num != 0) {
            System.out.println("Number: ");
            num = sc.nextInt();
            total += num;
            System.out.println("The total so far is " + total);
        }

        System.out.println();
        if (num == 0) {
            System.out.println("The total of number is " + total);
        }


    }
}
