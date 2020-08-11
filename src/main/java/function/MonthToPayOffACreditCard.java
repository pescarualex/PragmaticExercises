package function;

import java.util.Scanner;
import java.lang.Math;

public class MonthToPayOffACreditCard {

    private void calculateMonthUntilPayOff(double b, double apr, double p) {
        double n;
        double i = apr / 100 / 365;

        double x = -1 / 30.0;
        double y = Math.log(1 + b / p * (1 - (Math.pow(1 + i, 30))));
        double z = Math.log(1 + i);

        n = Math.ceil( x * y / z);

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
