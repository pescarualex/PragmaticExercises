package programingByDoing.variable;

import java.util.Scanner;

public class ADumdCalculator_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your first number?");
        double firstNum = sc.nextDouble();
        System.out.println("What is your second number?");
        double secondNum = sc.nextDouble();
        System.out.println("What is your third number?");
        double thirdNum = sc.nextDouble();

        double total = firstNum + secondNum + thirdNum;
        double totalDivided = total / 2;

        System.out.println("(" + firstNum + " + " + secondNum + " + " + thirdNum + ") / 2 is..." + totalDivided);
    }
}
