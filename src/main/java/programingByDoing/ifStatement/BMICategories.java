package programingByDoing.ifStatement;

import java.util.Scanner;

public class BMICategories {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your weight: ");
        double weight = sc.nextDouble();
        System.out.println("Your height: ");
        double height = sc.nextDouble();

        double bmi = weight / (Math.pow(height, 2));

        System.out.println("Your bmi is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Bmi category: underweigth");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Bmi category: normal weight");
        } else if (bmi >= 25 && bmi <= 30) {
            System.out.println("Bmi category: overweight");
        } else if (bmi >= 30) {
            System.out.println("Bmi category: obese");
        }

    }

}
