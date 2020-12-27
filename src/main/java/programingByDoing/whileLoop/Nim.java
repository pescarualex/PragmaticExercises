package programingByDoing.whileLoop;

import programingByDoing.ScannerUtils;

import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {

        String choosePlayer1;
        String choosePlayer2;
        int removePile;
        int totalPile;
        int a = 3, b = 5, c = 8;

        System.out.print("Player 1, enter your name: ");
        String player1 = ScannerUtils.readNextString();
        System.out.print("Player 2, enter your name: ");
        String player2 = ScannerUtils.readNextString();


        do {
            totalPile = a + b + c;

            if (totalPile == 0) {
                System.out.println(player1 + ", you Win!");
                System.exit(0);
            }

            System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
            System.out.print(player1 + ", choose a pile: ");
            choosePlayer1 = ScannerUtils.readNextString();

            if (choosePlayer1.equalsIgnoreCase("a")) {
                if (a == 0) {
                    System.out.println("Nice try, " + player1 + ". That's pile in empty. Choose again.");
                    choosePlayer1 = ScannerUtils.readNextString();
                }
                System.out.println("How many to remove from a pile " + choosePlayer1.toUpperCase() + "?");
                removePile = ScannerUtils.readNextSingleInt();
                if (removePile == 0) {
                    System.out.println("You must choose at least 1. How many?");
                    removePile = ScannerUtils.readNextSingleInt();
                }
                a -= removePile;

            } else if (choosePlayer1.equalsIgnoreCase("b")) {
                if (b == 0) {
                    System.out.println("Nice try, " + player1 + ". That's pile in empty. Choose again.");
                    choosePlayer1 = ScannerUtils.readNextString();
                }
                System.out.println("How many to remove from a pile " + choosePlayer1.toUpperCase() + "?");
                removePile = ScannerUtils.readNextSingleInt();
                if (removePile == 0) {
                    System.out.println("You must choose at least 1. How many?");
                    removePile = ScannerUtils.readNextSingleInt();
                }
                b -= removePile;

            } else if (choosePlayer1.equalsIgnoreCase("c")) {
                if (c == 0) {
                    System.out.println("Nice try, " + player1 + ". That's pile in empty. Choose again.");
                    choosePlayer1 = ScannerUtils.readNextString();
                }
                System.out.println("How many to remove from a pile " + choosePlayer1.toUpperCase() + "?");
                removePile = ScannerUtils.readNextSingleInt();
                if (removePile == 0) {
                    System.out.println("You must choose at least 1. How many?");
                    removePile = ScannerUtils.readNextSingleInt();
                }
                c -= removePile;
            }


            System.out.println();

            totalPile = a + b + c;

            if (totalPile == 0) {
                System.out.println(player2 + ", you Win!");
                System.exit(0);
            }

            System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
            System.out.print(player2 + ", choose a pile:");
            choosePlayer2 = ScannerUtils.readNextString();

            if (choosePlayer2.equalsIgnoreCase("a")) {
                if (a == 0) {
                    System.out.println("Nice try, " + player2 + ". That's pile in empty. Choose again.");
                    choosePlayer2 = ScannerUtils.readNextString();
                }
                System.out.println("How many to remove from a pile " + choosePlayer2.toUpperCase() + "?");
                removePile = ScannerUtils.readNextSingleInt();
                if (removePile == 0) {
                    System.out.println("You must choose at least 1. How many?");
                    removePile = ScannerUtils.readNextSingleInt();
                }
                a -= removePile;

            } else if (choosePlayer2.equalsIgnoreCase("b")) {
                if (b == 0) {
                    System.out.println("Nice try, " + player2 + ". That's pile in empty. Choose again.");
                    choosePlayer2 = ScannerUtils.readNextString();
                }
                System.out.println("How many to remove from a pile " + choosePlayer2.toUpperCase() + "?");
                removePile = ScannerUtils.readNextSingleInt();
                if (removePile == 0) {
                    System.out.println("You must choose at least 1. How many?");
                    removePile = ScannerUtils.readNextSingleInt();
                }
                b -= removePile;

            } else if (choosePlayer2.equalsIgnoreCase("c")) {
                if (c == 0) {
                    System.out.println("Nice try, " + player2 + ". That's pile in empty. Choose again.");
                    choosePlayer2 = ScannerUtils.readNextString();
                }
                System.out.println("How many to remove from a pile " + choosePlayer2.toUpperCase() + "?");
                removePile = ScannerUtils.readNextSingleInt();
                if (removePile == 0) {
                    System.out.println("You must choose at least 1. How many?");
                    removePile = ScannerUtils.readNextSingleInt();
                }
                c -= removePile;
            }
        } while (totalPile > 0);




    }
}
