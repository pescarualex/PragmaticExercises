package programingByDoing.arrays;

import java.util.concurrent.ThreadLocalRandom;

public class BasicArrays2 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int ramdom = ThreadLocalRandom.current().nextInt(1, 100);

            arr[i] = ramdom;

            System.out.println("Slot " + i + " contains a " + arr[i]);
        }
    }
}
