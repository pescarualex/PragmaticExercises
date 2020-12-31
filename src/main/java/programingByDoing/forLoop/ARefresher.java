package programingByDoing.forLoop;

import java.util.Scanner;

public class ARefresher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = sc.nextLine();
        int loopEnd = 10;

        if (name.equalsIgnoreCase("Michael")) {
            loopEnd = 5;
        }

        for (int i = 0; i < loopEnd; i++) {
            System.out.println(name);
        }

        sc.close();

    }
}
