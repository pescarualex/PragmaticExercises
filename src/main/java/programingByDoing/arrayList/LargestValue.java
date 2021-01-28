package programingByDoing.arrayList;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class LargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int largestValue = 0;
        int indexOfMaxValue = 0;

        for (int i = 0; i < 10; i++) {
            nums.add(ThreadLocalRandom.current().nextInt(1, 100));
        }

        System.out.println("ArrayList: " + nums);

        //find the max value and his index
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > largestValue) {
                largestValue = nums.get(i);
                indexOfMaxValue = i;
            }
        }

        System.out.println("The largest value is " + largestValue + ", wich is in slot " + indexOfMaxValue);


    }
}
