package makeingDecision;



import java.util.Scanner;

public class BmiCalculator {

    private static double bmiResult;
    private static String weight;
    private static String height;
   private double getHeightInInches;
   private double getWeightInPounds;
   private static double minWeight = 18.5;
   private static double maxWeight = 25;


    private void convertInput() {
        double heightD = Double.parseDouble(height);
        double weightD = Double.parseDouble(weight);
        getHeightInInches = Math.round((heightD * 0.393700787) * 100) / 100.0;
        getWeightInPounds =  Math.round((2.20462262 * weightD) * 100) / 100.0;


    }

    private void doMath() {
        convertInput();
        bmiResult = Math.round ((( getWeightInPounds / (getHeightInInches * getHeightInInches)) * 703) * 100) / 100.0;
    }

    private void getWeightFromUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Weight:");
        weight = sc.next();

        if (!weight.matches("^[0-9]+$")) {
            System.out.println("Please enter a valid data.");
            getWeightFromUser();
        }


    }

    private void getHeightFromUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Height:");
        height = sc.next();

        if (!height.matches("^[0-9]+$")) {
            System.out.println("Please enter a valid data.");
            getHeightFromUser();
        }
    }

    public static void main(String[] args) {
        BmiCalculator bmi = new BmiCalculator();



        bmi.getWeightFromUser();
        bmi.getHeightFromUser();
        bmi.doMath();



        if (bmiResult < minWeight) {
            System.out.println("Your BMI is " + bmiResult);
            System.out.println("Uohoo, you should to see a doctor.");
        } else if (bmiResult > maxWeight) {
            System.out.println("Your BMI is " + bmiResult);
            System.out.println("You must to see a doctor.");
        } else {
            System.out.println("Your BMI is " + bmiResult);
            System.out.println("You are within the ideal weight range.");
        }


    }



}
