package pragmaticExercises.makeingDecision;

import java.util.Scanner;

public class TaxCalculator {



    public static void main(String[] args) {

        int amout;
        String state;
        double subtotal;
        double tax;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wht is the order amount?");
        amout = scanner.nextInt();
        System.out.println("What is the state?");
        state = scanner.next();

        if (state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("WISCONSIN")) {
            subtotal = amout;
            tax = subtotal * 5.5 / 100;
            total = subtotal + tax;
            System.out.println("The subtotal is $" + subtotal + "\n" +
                    "The tax is $" + tax + "\n" +
                    "The total is $" + total);
        } else {
            System.out.println("The total is $" + amout);
        }



    }


    }

