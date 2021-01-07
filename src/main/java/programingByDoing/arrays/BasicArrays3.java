package programingByDoing.arrays;

import java.util.concurrent.ThreadLocalRandom;

public class BasicArrays3 {
    public static void main(String[] args) {
        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(10, 99);
            if (arr[i] % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(arr[i] + "  ");
            }
        }
    }
}
