package makeingDecision;

import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];

        System.out.println("Enter the first number: ");
        int firstNum = sc.nextInt();
        array[0] = firstNum;

        System.out.println("Enter the second number: ");
        int secondNum = sc.nextInt();
        array[1] = secondNum;

        System.out.println("Enter the third number: ");
        int thirdNum = sc.nextInt();
        array[2] = thirdNum;


            if (array[0] > array[1] && array[0] > array[2]) {
                System.out.println("The largest number is " + array[0]);
            } else if (array[1] > array[0] && array[1] > array[2]) {
                System.out.println("The largest number is  " + array[1]);
            } else if (array[2] > array[0] && array[2] > array[1]) {
                System.out.println("The largest number is " + array[2]);
            }

    }

}
