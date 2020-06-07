package InputProcesingOutput;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");
        String number1 = scanner.nextLine();
        int num1 = Integer.parseInt(number1);

        System.out.println("What is the second number?");
        String number2 = scanner.nextLine();
        int num2 = Integer.parseInt(number2);


        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.println(number1 + " + " + number2 + " = " + sum + "\n"
                          + number1 + " - " + number2 + " = " + difference + "\n"
                          + number1 + " * " + number2 + " = " + product + "\n"
                          + number1 + " / " + number2 + " = " + quotient);
    }
}
