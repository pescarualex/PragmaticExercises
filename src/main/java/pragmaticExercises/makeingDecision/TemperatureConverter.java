package pragmaticExercises.makeingDecision;

import java.util.Scanner;

public class TemperatureConverter {

    private static double  C;
    private static double F;

    private void getTemperatureInCelsius() {
        C = (F - 32) * 5 / 9;
        System.out.println(C);
    }

    private void getTemperatureInFahrenheit() {
        F = (C * 9 / 5) + 32;
        System.out.println(F);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter temp = new TemperatureConverter();

        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.");
        String getChoise = scanner.nextLine();

        if (!getChoise.matches("[a-zA-Z]+")) {
            System.out.println("Please enter a valid data.");
            main(args);
        }

        if (getChoise.equalsIgnoreCase("C")) {
            System.out.println("F:");
            F = scanner.nextDouble();
            temp.getTemperatureInCelsius();
        } else if (getChoise.equalsIgnoreCase("F")) {
            System.out.println("C:");
            C = scanner.nextDouble();
            temp.getTemperatureInFahrenheit();
        }

    }

}
