package makeingDecision;

import java.util.Scanner;

public class PasswordValidation {

    static String password = "abc$123";
    String getPassword;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PasswordValidation pass = new PasswordValidation();

        System.out.println("What is the password?");
        pass.getPassword = scanner.next();
        scanner.nextLine();

        if (pass.getPassword.equals(password)) {
            System.out.println("Welcome!!");
        } else {
            System.out.println("I don't know you.");
        }





    }
}
