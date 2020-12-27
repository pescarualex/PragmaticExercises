package programingByDoing.variable;

import java.util.Scanner;

public class NameAgeandSalary_3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello! Wjat is your name?");
        String name = keyboard.next();
        System.out.println("Hi " + name + "! How old are you?");
        int age = keyboard.nextInt();
        System.out.println("So, you're " + age + ", eh? That's not old at all!\n" +
                "How much do you make, " + name + "?");
        double amount = keyboard.nextDouble();
        System.out.println(amount + "! I hope that's per hour and not per year, lol!!");
    }
}
