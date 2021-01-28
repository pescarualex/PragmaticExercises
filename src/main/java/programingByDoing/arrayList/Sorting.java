package programingByDoing.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add(ThreadLocalRandom.current().nextInt(1, 100));
        }

        System.out.println("ArrayList: " + nums);

        sort(nums);

        System.out.println("ArrayList sorted: " + nums);
    }

    public static void sort(ArrayList<Integer> nums) {
        nums.sort(Collections.reverseOrder());
    }
}
