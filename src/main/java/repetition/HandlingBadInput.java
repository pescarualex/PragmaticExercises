package repetition;

import java.util.Scanner;

public class HandlingBadInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String rate;
        boolean stop = true;

        while (stop) {
            System.out.println("What is the rate of return?");
            rate = sc.nextLine();
            if (rate.equals("0")) {
                System.out.println("Sorry. That's not a valid input.");
            } else if (rate.matches("^[a-zA-Z]*$")) {
                System.out.println("Sorry. That's not a valid input.");
            } else if (rate.matches("^[0-9]*$")) {
                int rateAsInt = Integer.parseInt(rate);
                int years = 72 / rateAsInt;
                System.out.println("It will take " + years + " years to double your initial  investment");
                stop = false;
            }
        }


    }

}
