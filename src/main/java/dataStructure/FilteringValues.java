package dataStructure;

import java.util.Scanner;

public class FilteringValues {


    public static void filterEvenNumbers(int[] num) {
        int i;

        for (i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a list of numbers, separated by spaces: ");
        String num = sc.nextLine();

        String[] numsSplit = num.split(" ");

        int[] number = new int[numsSplit.length];

        for (int i = 0; i < numsSplit.length; i++) {
            number[i] = Integer.parseInt(numsSplit[i]);
        }

        System.out.print("The even number are: ");
        filterEvenNumbers(number);
    }


}
