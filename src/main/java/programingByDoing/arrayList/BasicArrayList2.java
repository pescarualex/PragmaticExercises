package programingByDoing.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BasicArrayList2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add(ThreadLocalRandom.current().nextInt(1, 100));
        }
        System.out.println("ArrayList: " + nums);
    }
}
