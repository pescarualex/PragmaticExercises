package programingByDoing.randomNumber;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards\n" +
                "Wich one is the ace?");
        System.out.println();
        System.out.println("        ##  ##  ##\n" +
                           "        ##  ##  ##\n" +
                           "        1   2   3");

        int i = 1 + r.nextInt(3);
        int guess = sc.nextInt();

        if (guess != i) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + i);
            if (i == 1) {
                System.out.println("        AA  ##  ##\n" +
                        "        AA  ##  ##\n" +
                        "        1   2   3");
            } else if (i == 2) {
                System.out.println("        ##  AA  ##\n" +
                        "        ##  AA  ##\n" +
                        "        1   2   3");
            } else if (i == 3) {
                System.out.println("        ##  ##  AA\n" +
                        "        ##  ##  AA\n" +
                        "        1   2   3");
            }
        } else {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
            if (i == 1) {
                System.out.println("        AA  ##  ##\n" +
                        "        AA  ##  ##\n" +
                        "        1   2   3");
            } else if (i == 2) {
                System.out.println("        ##  AA  ##\n" +
                        "        ##  AA  ##\n" +
                        "        1   2   3");
            } else if (i == 3) {
                System.out.println("        ##  ##  AA\n" +
                        "        ##  ##  AA\n" +
                        "        1   2   3");
            }
        }


    }

}
