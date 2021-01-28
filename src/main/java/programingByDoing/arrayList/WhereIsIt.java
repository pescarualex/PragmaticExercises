package programingByDoing.arrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WhereIsIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add(ThreadLocalRandom.current().nextInt(1, 50));
        }

        System.out.println("ArrayList: " + nums);
        System.out.print("Value to find: ");
        int toFind = scanner.nextInt();

        for (int i = 0; i < nums.size(); i++) {
            if (toFind == nums.get(i)) {
                System.out.println(toFind + " is in slot " + i);
            } else {
                System.out.println(toFind + " is not in the ArrayList.");
            }

        }


    }
}
