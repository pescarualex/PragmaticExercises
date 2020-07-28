package makeingDecision;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BloodAlcoholCalculator {

    int A;
    double W;
    String gender;
    int numberOfDrinks;
    double r;
    int H;
    double BAC;

    Scanner sc = new Scanner(System.in);

    // nu reusesc sa imi dau seama de ce rezultatul e cu - in fata..
    // te rog sa-mi dai un feedback pentru asta
    // nu imi mai maanc nervii cu exercitiul asta.. si asa,
    // nu functioneaza cum trebe..14-18

    public void calculate() {
        convertTheValue();
        BAC = Math.round(((A * 5.14 / W * r) - 0.015 * H) * 100) / 100.0;
    }

    public void convertTheValue() {
        double A = Math.round(((numberOfDrinks * (5.5 / 100)) * 33.8140) * 100) / 100.0;
        double weightInPounds = Math.round((W * 2.2046) * 100) / 100.0;
    }

    private void getWeight() {
        try {
            System.out.println("What is the weigt?");
            W = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid value. Try again!");
            getWeight();
        }
    }

    private void getGender() {
        System.out.println("What is the geder?(men or woman)");
        gender = sc.next();

        if (!gender.matches("[a-zA-z]+")) {
            System.out.println("Please enter the sugest.");
            getGender();
        }

        if (gender.equalsIgnoreCase("men")) {
            r = 0.73;
        } else if (gender.equalsIgnoreCase("Women")){
            r = 0.66;
        }
    }

    private void getNumberOfDrinks() {
        try {
            System.out.println("What is the number of drinks?");
            numberOfDrinks = sc.nextInt();
        } catch (InputMismatchException | StackOverflowError e) {
            System.out.println("Please enter a valid data.");
            getNumberOfDrinks();
        }

    }

    private void getHoursOfLastDrink() {
        try {
            System.out.println("How long has it been since the last drink?");
            H = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid data.");
            getHoursOfLastDrink();
        }
    }


    public static void main(String[] args) {
        BloodAlcoholCalculator bac = new BloodAlcoholCalculator();

        bac.getWeight();
        bac.getGender();
        bac.getNumberOfDrinks();
        bac.getHoursOfLastDrink();
        bac.calculate();

        System.out.println("Your BAC is " + bac.BAC);

        if (bac.BAC >= 0.08) {
            System.out.println("It's not legal for you to drive");
        } else {
            System.out.println("It's legal for you to drive");
        }


    }
}
