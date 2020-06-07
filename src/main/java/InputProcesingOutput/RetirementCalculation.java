package InputProcesingOutput;



import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your currecnt age?");
        String age = scanner.nextLine();
        int age1 = Integer.parseInt(age);

        System.out.println("At what age would you like to retire?");
        String retireAge = scanner.nextLine();
        int retireAge1 = Integer.parseInt(retireAge);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        int yearLeftToRetire = retireAge1 - age1;
        int dateToRetire = currentYear + yearLeftToRetire;

        System.out.println("You have " + yearLeftToRetire + " year left until you can retire.\n" +
                          "It's " + currentYear + ", so you can retine in " + dateToRetire);

    }
}
