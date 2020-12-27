package programingByDoing.ifStatement;

import java.util.Scanner;

public class GenderGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your gender?(M or F)");
        String gender = sc.next();
        System.out.println("First name: ");
        String firstName = sc.next();
        System.out.println("Last name: ");
        String lastName = sc.next();
        System.out.println("Age: ");
        int age = sc.nextInt();

        if (gender.equalsIgnoreCase("f") && age > 20) {
            System.out.println("Are you maried, " + firstName + "?");
            String areMaried = sc.next();
            if (areMaried.equalsIgnoreCase("y")) {
                System.out.println("Then I shall call you Mrs. " + lastName);
            } else if (areMaried.equalsIgnoreCase("n")) {
                System.out.println("Then I shall call you Ms. " + lastName);
            }
        } else if (gender.equalsIgnoreCase("f") && age < 20) {
            System.out.println("Then I shall call you  " + firstName + lastName);
        }
        if (gender.equalsIgnoreCase("m") && age > 20) {
            System.out.println("Are you maried, " + firstName + "?");
            String areMaried = sc.next();
            if (areMaried.equalsIgnoreCase("y")) {
                System.out.println("Then I shall call you Mr. " + lastName);
            } else if (areMaried.equalsIgnoreCase("n")) {
                System.out.println("Then I shall call you Mr. " + lastName);
            }
        } else if (gender.equalsIgnoreCase("m") && age < 20) {
            System.out.println("Then I shall call you  " + firstName + lastName);
        }


    }


}
