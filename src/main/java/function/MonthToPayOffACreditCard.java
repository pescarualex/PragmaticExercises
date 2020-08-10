package function;

import java.util.Scanner;
import java.lang.Math;

public class MonthToPayOffACreditCard {

    private double calculateMonthUntilPayOff(double b, double apr, double p) {
        double n = 0;
        double aprDivided = (apr / 100) / 350;
        double i = aprDivided;



        System.out.println("It will take you " + n + " months to pay off this card.");

        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonthToPayOffACreditCard payOff = new MonthToPayOffACreditCard();

        System.out.println("What is your balance?");
        double b = sc.nextDouble();
        System.out.println("What is the apr on the card (as a percent)?");
        double apr = sc.nextDouble();
        System.out.println("What is the montly payment you can make?");
        double p = sc.nextDouble();

        payOff.calculateMonthUntilPayOff(b, apr, p);

    }
}
