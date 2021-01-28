package programingByDoing.arrayList;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayList1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add(-113);
            System.out.println("Slot " + i + " contains a " + nums.get(i));
        }


    }
}
