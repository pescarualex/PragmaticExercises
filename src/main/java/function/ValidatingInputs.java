package function;

import java.util.Scanner;

public class ValidatingInputs {


    private void validateTheFirstName(String firstName) {
        if (firstName.isEmpty()) {
            System.out.println("The first name must be filled in.");
        } else if (firstName.length() < 2) {
            System.out.println("\"" + firstName + "\"" + " Is not a valid first name. It is too short.");
        }
    }

    private void validateTheLastName(String lastName) {
        if (lastName.isEmpty()) {
            System.out.println("The last name must be filled in.");
        } else if (lastName.length() < 2) {
            System.out.println("\"" + lastName + "\"" + " Is not a valid last name. It is too short.");
        }
    }

    private void validateTheZIP(String zip) {
        if (zip.matches("^[a-zA-Z!@#$%^&*()+=|}{:;'?/><,.`~]*$")) {
            System.out.println("The ZIP code must be numeric.");
        }
    }

    private void validateTheEmployeeID(String employeeID) {
        if (!employeeID.matches("^[A-Z]{2}-[0-9]{4}$")) {
            System.out.println(employeeID + " is not a valid ID.");
        }
    }

    private void validateInput(String firstName, String lastName, String zip, String employeeID) {
        if (!firstName.isEmpty() && firstName.length() > 2 &&
            !lastName.isEmpty() && lastName.length() > 2 &&
            zip.matches("^[0-9]*$") &&
            employeeID.matches("^[A-Z]{2}-[0-9]{4}$")) {
            System.out.println("There were no errors found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidatingInputs validatingInputs = new ValidatingInputs();

        System.out.println("Enter the first name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter the last name:");
        String lastName = sc.nextLine();

        System.out.println("Enter the ZIP code:");
        String zip = sc.nextLine();

        System.out.println("Enter an employee ID:");
        String employeeID = sc.nextLine();


        validatingInputs.validateTheFirstName(firstName);
        validatingInputs.validateTheLastName(lastName);
        validatingInputs.validateTheZIP(zip);
        validatingInputs.validateTheEmployeeID(employeeID);
        validatingInputs.validateInput(firstName, lastName, zip, employeeID);
    }
}
