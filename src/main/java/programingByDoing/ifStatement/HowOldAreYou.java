package programingByDoing.ifStatement;

import java.util.Scanner;

public class HowOldAreYou {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hey, what's your name?");
        String name = sc.next();

        System.out.println("Ok, " + name + ", how old are you?");
        int age = sc.nextInt();

        if (age < 16) {
            System.out.println("You can't drive," + name);
        }
        if (age < 18 && age > 16) {
            System.out.println("You can't vote but you can drive, " + name);
        }
        if (age < 25) {
            System.out.println("You can't rent a car, but you can vote and drive " + name);
        }
        if (age > 25) {
            System.out.println("You can do anything that's legal, " + name);
        }
    }
}
