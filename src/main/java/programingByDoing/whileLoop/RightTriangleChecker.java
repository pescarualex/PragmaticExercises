package programingByDoing.whileLoop;

import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter three integer:\n" +
                "Side 1:");
        int sideOne = keyboard.nextInt();
        int sideTwo;
        int sideThree;

        do {
            System.out.println("Side 2: ");
            sideTwo = keyboard.nextInt();
            if (sideOne > sideTwo) {
                System.out.println(sideTwo + " is smaller than " + sideOne + ". Try again: ");
            }
        } while (sideOne > sideTwo);

        do {
            System.out.println("Side 3: ");
            sideThree = keyboard.nextInt();
            if (sideTwo > sideThree) {
                System.out.println(sideTwo + " is smaller than " + sideThree + ". Try again: ");
            }
        } while (sideTwo > sideThree);

        System.out.println("Youe three sides are " + sideOne + ", " + sideTwo + ", " + sideThree);

        double totalSizeOfSideOneAndThree = Math.sqrt((sideOne * sideOne) + (sideTwo * sideTwo));

        if (totalSizeOfSideOneAndThree == sideThree) {
            System.out.println("These sides make a right triangle.");
        } else {
            System.out.println("No, these sides do not make a right triangle.");
        }



    }
}
