package function;

import java.util.Scanner;

public class PasswordStrengthIndicator {

    private void passwordValidator(String password) {

        if (password.matches("(?=.*[0-9]).*")) {
            System.out.println("The password '" + password + "' is a very week password.");
        } else if (password.matches("([a-z]+)")) {
            System.out.println("The password '" + password + "' is a week password.");
        } else if (password.matches("([0-9]+)") && password.matches(("([a-z]+)"))) {
            System.out.println("The password '" + password + "' is a strong password.");
        } else if (password.matches("^(?=.*[a-z])")) {
            if (password.matches("(?=.*[0-9])")) {
                if (password.matches("(?=.*[!@#\\$%\\^&\\*])")) {
                    System.out.println("The password '" + password + "' is a very strong password.");
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordStrengthIndicator pass = new PasswordStrengthIndicator();

        System.out.println("Enter the password: ");
        String password = sc.next();

        pass.passwordValidator(password);


    }

}
