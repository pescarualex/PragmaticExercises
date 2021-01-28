package programingByDoing.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CopyingArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> copyNums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add(ThreadLocalRandom.current().nextInt(1, 100));
            copyNums.add(nums.get(i));
        }

        nums.set(9, -7);

        System.out.println("ArrayList 1: " + nums);
        System.out.println("ArrayList 2: " + copyNums);


    }
}
