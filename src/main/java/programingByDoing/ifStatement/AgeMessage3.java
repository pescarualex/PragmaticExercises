package programingByDoing.ifStatement;

import java.util.Scanner;

public class AgeMessage3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your name?");
        String name = sc.next();
        System.out.println("Your age?");
        int age = sc.nextInt();

        if (age < 16) {
            System.out.println("You can't drive");
        }
        if (age >= 16 && age <= 17) {
            System.out.println("You can drive but not vote");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("You can vote but not rent a car");
        }
        if (age >= 25) {
            System.out.println("You can do pretty much anything");
        }

    }


}
