package programingByDoing.arrays;

import java.util.concurrent.ThreadLocalRandom;

public class LocatingTheLargestValueInAnArray {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        int largestNum = 0;
        int slot = 0;

        System.out.print("Array: ");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = ThreadLocalRandom.current().nextInt(1, 100);

            System.out.print(arrays[i] + " ");

            if (arrays[i] > largestNum) {
                largestNum = arrays[i];
                slot = i;

            }
        }

        System.out.println("\nThe largest value is " + largestNum + "\n" +
                "It is in slot " + slot);


    }
}
