package programingByDoing.arrays;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class IsItThereOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isIn = false;
        int count = 0;

        int[] arr = new int[10];

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1, 50);
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nValue to find: ");
        int value = sc.nextInt();

        for (int num : arr) {
            if (num == value) {
                count++;
                isIn = true;
            }
        }

        if (isIn) {
            System.out.println(value + " is in the array and was found " + count + " times.");
        } else {
            System.out.println(value + " is not in the array.");
        }
    }
}
