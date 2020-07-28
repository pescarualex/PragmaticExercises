package makeingDecision;

import java.util.Scanner;

public class LegalDrivingAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        String ans = age >= 16 ? "You are old enought to legally drive" : "You are not old enought to legally drive.";

        System.out.println(ans);
    }


}
