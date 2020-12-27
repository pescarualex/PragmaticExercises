package pragmaticExercises.repetition;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuesTheNumberGame {



    private static int counter = 1;
    private static int wrongGuess = 0;


    private void getTheLevel() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Let's play Guess the number game!\n" +
                "Pick a difficulty level. 1, 2 or 3?");

        String getDiffOfLevel = sc.next();
        sc.nextLine();

        switch (getDiffOfLevel) {
            case "1":
                System.out.println("I have my number. What's your guess?");
                levelOne();
                break;
            case "2":
                System.out.println("I have my number. What's your guess?");
                levelTwo();
                break;
            case "3":
                System.out.println("I have my number. What's your guess?");
                levelThree();
                break;
            default:
                System.out.println("You entered wrong value. Try again!");
                getTheLevel();
        }

    }

    private void levelOne() {
        try {
            Scanner sc = new Scanner(System.in);

            int getGuessToUser = sc.nextInt();
            sc.nextLine();

            int rangeOfLevel = ThreadLocalRandom.current().nextInt(1, 10);

            while (getGuessToUser != rangeOfLevel) {
                counter++;

                if (getGuessToUser > rangeOfLevel) {
                    System.out.println("Too high. Guess again: ");
                    getGuessToUser = sc.nextInt();
                } else if (getGuessToUser < rangeOfLevel) {
                    System.out.println("Too low. Guess again: ");
                    getGuessToUser = sc.nextInt();
                }

                if (getGuessToUser == rangeOfLevel) {
                    System.out.println("You got it in " + counter + " guesses!\n" +
                            "You wrong of " + wrongGuess + " times.\n" +
                            "Play again?(Y/N)");
                    String getAns = sc.next();
                    if (getAns.equalsIgnoreCase("Y")) {
                        counter = 1;
                        getTheLevel();
                    } else {
                        System.out.println("Goodbay!");
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You enter a non-numeric value. Try again!");
            wrongGuess++;
            levelOne();
        }
    }

    private void levelTwo() {
        try {
            Scanner sc = new Scanner(System.in);

            int getGuessToUser = sc.nextInt();
            sc.nextLine();

            int rangeOfLevel = ThreadLocalRandom.current().nextInt(1, 100);

            while (getGuessToUser != rangeOfLevel) {
                counter++;

                if (getGuessToUser > rangeOfLevel) {
                    System.out.println("Too high. Guess again: ");
                    getGuessToUser = sc.nextInt();
                } else if (getGuessToUser < rangeOfLevel) {
                    System.out.println("Too low. Guess again: ");
                    getGuessToUser = sc.nextInt();
                }

                if (getGuessToUser == rangeOfLevel) {
                    System.out.println("You got it in " + counter + " guesses!\n" +
                            "You wrong of " + wrongGuess + " times.\n" +
                            "Play again?(Y/N)");
                    String getAns = sc.next();
                    if (getAns.equalsIgnoreCase("Y")) {
                        counter = 1;
                        getTheLevel();
                    } else {
                        System.out.println("Goodbay!");
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You enter a non-numeric value. Try again!");
            wrongGuess++;
            levelOne();
        }
    }

    private void levelThree() {
        try {
            Scanner sc = new Scanner(System.in);

            int getGuessToUser = sc.nextInt();
            sc.nextLine();

            int rangeOfLevel = ThreadLocalRandom.current().nextInt(1, 1000);

            while (getGuessToUser != rangeOfLevel) {
                counter++;

                if (getGuessToUser > rangeOfLevel) {
                    System.out.println("Too high. Guess again: ");
                    getGuessToUser = sc.nextInt();
                } else if (getGuessToUser < rangeOfLevel) {
                    System.out.println("Too low. Guess again: ");
                    getGuessToUser = sc.nextInt();
                }

                if (getGuessToUser == rangeOfLevel) {
                    System.out.println("You got it in " + counter + " guesses!\n" +
                            "You wrong of " + wrongGuess + " times.\n" +
                            "Play again?(Y/N)");
                    String getAns = sc.next();
                    if (getAns.equalsIgnoreCase("Y")) {
                        counter = 1;
                        getTheLevel();
                    } else {
                        System.out.println("Goodbay!");
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You enter a non-numeric value. Try again!");
            wrongGuess++;
            levelOne();
        }
    }


    public static void main(String[] args) {
        GuesTheNumberGame game = new GuesTheNumberGame();
        game.getTheLevel();
    }


}






