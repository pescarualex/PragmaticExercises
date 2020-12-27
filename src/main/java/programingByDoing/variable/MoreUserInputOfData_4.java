package programingByDoing.variable;

import java.util.Scanner;

public class MoreUserInputOfData_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the following information so I can sell it for profit!");

        System.out.println("First name: ");
        String firstName = sc.next();
        System.out.println("Last name: ");
        String lastName = sc.next();
        System.out.println("Grade (9-12): ");
        int grade = sc.nextInt();
        System.out.println("Student ID: ");
        int studentId = sc.nextInt();
        System.out.println("Login: ");
        String login = sc.next();
        System.out.println("GPA (0.0-4.0: ");
        double gpa = sc.nextDouble();

        System.out.println("Your information: \n" +
                "       Login: " + login + "\n" +
                "       ID: " + studentId + "\n" +
                "       Name: " + lastName + ", " + firstName + "\n" +
                "       GPA: " + gpa + "\n" +
                "       Grade: " + grade);

    }
}
