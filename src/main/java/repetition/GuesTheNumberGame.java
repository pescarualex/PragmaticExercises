package repetition;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuesTheNumberGame {

    Scanner sc = new Scanner(System.in);

    private static int counter = 1;
    private static int wrongGuess = 1;


    private void getDifficulty() {
        System.out.println("Let's play Guess the Number!\n" +
                "Pick a difficulty level (1, 2 or 3): ");

        try {
            int getAns = sc.nextInt();

            if (getAns == 1) {
                levelOne();
            } else if (getAns == 2) {
                levelTwo();
            } else if (getAns == 3) {
                levelThree();
            }
        } catch (InputMismatchException e) {
            System.out.println("You have entered a non-numeric value. Try again.");
            getDifficulty();
        }


    }

    private void levelOne() {
        try {
            System.out.println("I have my number, what's your guess?");

            int getTheGuess = sc.nextInt();

            int rangeOfLevel = ThreadLocalRandom.current().nextInt(1, 10);

            while (getTheGuess != rangeOfLevel) {
                counter++;

                if (getTheGuess > rangeOfLevel) {
                    System.out.println("To hight. Guess again: ");
                    getTheGuess = sc.nextInt();
                } else if (getTheGuess < rangeOfLevel) {
                    System.out.println("To low. Guess again: ");
                    getTheGuess = sc.nextInt();
                }

                if (getTheGuess == rangeOfLevel) {
                    System.out.println("You got it in " + counter);
                    System.out.println("Play again?");
                    String getAns = sc.next();
                    if (getAns.equalsIgnoreCase("y")) {
                        counter = 1;
                        getDifficulty();
                    } else if (getAns.equalsIgnoreCase("n")) {
                        System.out.println("Goodbay!");
                    }
                }
            }
        } catch (InputMismatchException e) {
            wrongGuess++;
            System.out.println("You enter a non-numeric value, try again.");
            getDifficulty();
        }
    }


    private void levelTwo() {
        System.out.println("I have my number, what's your guess?");

        int getTheGuessTwo = sc.nextInt();

        int rangeOfLevelTwo = ThreadLocalRandom.current().nextInt(1, 100);

        while (getTheGuessTwo != rangeOfLevelTwo) {
            counter++;

            if (getTheGuessTwo > rangeOfLevelTwo) {
                System.out.println("To hight. Guess again: ");
                getTheGuessTwo = sc.nextInt();
            } else if (getTheGuessTwo < rangeOfLevelTwo) {
                System.out.println("To low. Guess again: ");
                getTheGuessTwo = sc.nextInt();
            }


            if (getTheGuessTwo == rangeOfLevelTwo) {
                System.out.println("You got it in " + counter);
                System.out.println("Play again?");
                String getAnsTwo = sc.next();
                if (getAnsTwo.equalsIgnoreCase("y")) {
                    counter = 1;
                    getDifficulty();
                } else if (getAnsTwo.equalsIgnoreCase("n")) {
                    System.out.println("Goodbay!");
                }
            }
        }
    }

    private void levelThree() {
        System.out.println("I have my number, what's your guess?");

        int getTheGuessThree = sc.nextInt();

        int rangeOfLevelThree = ThreadLocalRandom.current().nextInt(1, 1000);

        while (getTheGuessThree != rangeOfLevelThree) {
            counter++;

            if (getTheGuessThree > rangeOfLevelThree) {
                System.out.println("To hight. Guess again: ");
                getTheGuessThree = sc.nextInt();
            } else if (getTheGuessThree < rangeOfLevelThree) {
                System.out.println("To low. Guess again: ");
                getTheGuessThree = sc.nextInt();
            }


            if (getTheGuessThree == rangeOfLevelThree) {
                System.out.println("You got it in " + counter);
                System.out.println("Play again?");
                String getAnsThree = sc.next();
                if (getAnsThree.equalsIgnoreCase("y")) {
                    counter = 1;
                    getDifficulty();
                } else if (getAnsThree.equalsIgnoreCase("n")) {
                    System.out.println("Goodbay!");
                }
            }
        }
    }

    public static void main(String[] args) {
        GuesTheNumberGame guess = new GuesTheNumberGame();
        guess.getDifficulty();
    }
}






