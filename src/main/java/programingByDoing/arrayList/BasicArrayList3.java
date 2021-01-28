package programingByDoing.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BasicArrayList3 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            nums.add(ThreadLocalRandom.current().nextInt(10, 99));
            System.out.print(i + " ");
        }

    }
}
