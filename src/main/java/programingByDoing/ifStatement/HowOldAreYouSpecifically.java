package programingByDoing.ifStatement;

import java.util.Scanner;

public class HowOldAreYouSpecifically {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = sc.next();
        System.out.println("Ok, " + name + ", how old are you?");
        int age = sc.nextInt();

        if (age < 16) {
            System.out.println("You can't drive.");
        } else if (age > 16 && age < 18) {
            System.out.println("You can drive but not vote.");
        } else if (age >= 18 && age < 24) {
            System.out.println("You can vote but nor rent a car.");
        } else if (age >= 25) {
            System.out.println("You can do pretty much anything.");
        }
    }
}
