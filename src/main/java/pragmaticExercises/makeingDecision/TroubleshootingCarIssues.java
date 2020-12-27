package pragmaticExercises.makeingDecision;

import java.util.Scanner;

public class TroubleshootingCarIssues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key?(Y/N)");
        String getAnswer = sc.nextLine();
        if (getAnswer.equalsIgnoreCase("Y")) {
            System.out.println("Are the battery terminals corroded?(Y/N)");
            String getAnswer2 = sc.nextLine();
            if (getAnswer2.equalsIgnoreCase("Y")) {
                System.out.println("Clean terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again.");
            }
        } else {
            System.out.println("Does the car me a clicking noise?(Y/N)");
            String getAns = sc.nextLine();
            if (getAns.equalsIgnoreCase("Y")) {
                System.out.println("Replace the battery.");
            } else {
                System.out.println("Does the car crank up but fail to start?(Y/N)");
                String getAnsw = sc.nextLine();
                if (getAns.equalsIgnoreCase("Y")) {
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.println("Does the engine start and than die?(Y/N)");
                    String getAnswer3 = sc.nextLine();
                    if (getAnswer3.equalsIgnoreCase("Y")) {
                        System.out.println("Does your car have fuel injection?(Y/N)");
                        String getAns4 = sc.nextLine();
                        if (getAns4.equalsIgnoreCase("Y")) {
                            System.out.println("Get it in for service.");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing.");

                        }
                    }
                }
            }
        }
    }



}
