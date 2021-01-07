package programingByDoing.arrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class CopyingArrays {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int[] copyArr = new int[10];

        //fill array with random number
        //and copying arr in copuArr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1, 100);

            copyArr[i] = arr[i];
        }

        //change value of last index
        arr[arr.length - 1] = -7;

        //display arr
        System.out.print("Array 1: ");//+ Arrays.toString(arr));
        for (int num : arr) {
            System.out.print(num + " ");
        }

        //display copyArr
        System.out.print("\nArray 2: ");//+ Arrays.toString(copyArr));
        for (int num : copyArr) {
            System.out.print(num + " ");
        }

    }
}
