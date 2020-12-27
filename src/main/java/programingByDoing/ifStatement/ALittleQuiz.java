package programingByDoing.ifStatement;

import java.util.Scanner;

public class ALittleQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfQuestion = 3;
        int countCorrectAnswer = 0;

        System.out.println("Are you ready for a quiz?");
        String next = sc.next();

        if (next.equalsIgnoreCase("y")) {
            System.out.println("Ok, here it comes!\n" +
                    "Q1. What is the capital of Alaska?\n" +
                    "       1. Melbourne\n" +
                    "       2. Anchorage\n" +
                    "       3. Juneau");
            int questionOne = sc.nextInt();
            if (questionOne == 3) {
                countCorrectAnswer++;
                System.out.println("That's correct!");
            } else {
                System.out.println("Sorry, the correct answer is Juneau.");
            }

            System.out.println("Q2. Can you store the value \"cat\" in a variable of type int?\n" +
                    "       1. Yes\n" +
                    "       2. No");
            int questionTwo = sc.nextInt();
            if (questionTwo == 2) {
                countCorrectAnswer++;
                System.out.println("That's right");
            } else {
                System.out.println("Sorry, \"cat\" is a String. Int can only store the numbers.");
            }

            System.out.println("Q3. What is the result of 9+6/3?\n" +
                    "       1. 5\n" +
                    "       2. 11\n" +
                    "       3. 15/3");
            int questionThree = sc.nextInt();
            if (questionThree == 2) {
                countCorrectAnswer++;
                System.out.println("That's right!");
            } else {
                System.out.println("Sorry, the correct answer is variant 2.");
            }
            System.out.println();
            System.out.println("Overall, you got " + countCorrectAnswer + " out of " + numberOfQuestion + " correct.\n" +
                    "Thanks for playing!!");

        } else if (next.equalsIgnoreCase("n")) {
            System.out.println("Ok, goodbye!");
            System.exit(0);
        }


    }
}
