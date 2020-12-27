package programingByDoing.variable;

import java.util.Scanner;

public class BMICalculator_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your height in m:");
        double height = sc.nextDouble();
        System.out.println("Your weight in kg:");
        double weight = sc.nextDouble();

        double bmi = weight / (Math.pow(height, 2));

        System.out.println("Your bmi is " + bmi);

    }

}
