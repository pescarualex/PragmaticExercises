package programingByDoing.project;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    static String operator;
    static int num1;
    static int num2;
    static boolean stop = true;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        while (stop) {

            System.out.print(">");
            num1 = sc.nextInt();
            operator = sc.next();
            num2 = sc.nextInt();

            if (operator.equalsIgnoreCase("+")) {
                addition(num1, num2);
            } else if (operator.equalsIgnoreCase("-")) {
                substraction(num1, num2);
            } else if (operator.equalsIgnoreCase("*")) {
                multiplication(num1, num2);
            } else if (operator.equalsIgnoreCase("/")) {
                division(num1, num2);
            } else {
                System.out.println("You entered a non valid operator. Try again: ");
                main(args);
            }
        }
    }


    public static void addition(int num1, int num2) {

        if (num1 == 0 || num2 == 0) {
            System.out.println("Goodbay!");
            stop = false;
            System.exit(0);
        }

        int total = num1 + num2;
        System.out.println(total);
    }


    public static void substraction(int a, int b) {

        if (a == 0 || b == 0) {
            System.out.println("Goodbay!");
            stop = false;
            System.exit(0);
        }

        int total = a - b;
        System.out.println(total);
    }

    public static void multiplication(int a, int b) {

        if (a == 0 || b == 0) {
            System.out.println("Goodbay!");
            stop = false;
            System.exit(0);
        }

        int total = a * b;
        System.out.println(total);
    }

    public static void division(double a, double b) {

        if (a == 0 || b == 0) {
            System.out.println("Goodbay!");
            stop = false;
            System.exit(0);
        }

        double total = a / b;
        System.out.println(total);
    }
}
