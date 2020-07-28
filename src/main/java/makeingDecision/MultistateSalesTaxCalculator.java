package makeingDecision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MultistateSalesTaxCalculator {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        final double taxEauClaire = 0.50;
        final double taxDunn = 0.40;
        final double taxIllinois = 0.80;

        double amount;
        String stateChoise;
        String residence;

        System.out.println("What is the order amount?");
        amount = sc.nextDouble();

        System.out.println("What state do you live in?");
        stateChoise = sc.next();

        if (stateChoise.equalsIgnoreCase("Wisconsin") || stateChoise.equalsIgnoreCase("WN")) {
            System.out.println("What is the residence?");
            residence = br.readLine();
            if (residence.equalsIgnoreCase("Eau Claire") || residence.equalsIgnoreCase("EC")) {
                double totalAmount = amount + taxEauClaire;
                System.out.println("The tax is $" + taxEauClaire + "\n" +
                        "The total is $" + totalAmount);
            } else if (residence.equalsIgnoreCase("Dunn") || residence.equalsIgnoreCase("D")) {
                double totalAmount = amount + taxDunn;
                System.out.println("The tax is $" + taxDunn + "\n" +
                        "The total is $" + totalAmount);
            }

        } else if (stateChoise.equalsIgnoreCase("Illinois") || stateChoise.equalsIgnoreCase("IL")) {
            double totalAmount = amount + taxIllinois;
            System.out.println("The tax is $" + taxIllinois + "\n" +
                    "The total is $" + totalAmount);
        } else {
            System.out.println("The total is $" + amount);
        }






    }


}
