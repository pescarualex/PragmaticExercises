package function;

import java.util.Scanner;
import java.lang.Math;

public class MonthToPayOffACreditCard {

    private void calculateMonthUntilPayOff(double b, double apr, double p) {
        double n;
        apr = (apr / 100) / 365;
        double i = Math.round(apr) * 100 / 100.0;

        double x = Math.round(Math.log((1 + (b / p))) * 100) / 100.0;
        double y = Math.round(Math.log(1 + i) * 100) / 100.0;
        double z = Math.round(Math.pow(1 + i, 30) * 100) / 100.0;
        n = Math.round((( -1 / 30 * x * (1 - z) / y)) * 100) / 100.0;

        System.out.println("It will take you " + n + " months to pay off this card.");
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
