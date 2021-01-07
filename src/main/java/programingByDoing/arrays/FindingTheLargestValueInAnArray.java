package programingByDoing.arrays;

import java.util.concurrent.ThreadLocalRandom;

public class FindingTheLargestValueInAnArray {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int largestNum = 0;

        //fill the array with random number
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1, 50);
            System.out.print(arr[i] + " ");

            //check if the last number is grater than actual number
            if (arr[i] - 1 > largestNum) {
                largestNum = arr[i];
            }
        }

        System.out.println("\nThe largest value is " + largestNum);


    }
}
