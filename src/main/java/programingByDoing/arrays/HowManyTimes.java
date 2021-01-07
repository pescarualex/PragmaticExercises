package programingByDoing.arrays;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HowManyTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1, 50);
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nValue to find: ");
        int value = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }

        System.out.println(value + " was find " + count + " times.");

    }
}
