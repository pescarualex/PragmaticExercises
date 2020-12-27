package programingByDoing.forLoop;

import java.util.Random;

public class BabyBlackjack {
    public static void main(String[] args) {

        System.out.println("---Baby Blackjack!---\n" +
                "");
        Random r = new Random();
        int first = 1 + r.nextInt(10);
        int second = 1 + r.nextInt(10);
        int third = 1 + r.nextInt(10);
        int four = 1 + r.nextInt(10);
        int total = 0;
        int totalDealer = 0;

        total = first + second;
        System.out.println("You drew has " + first + " and " + second + ".\n" +
                "Your total is " + total);

        totalDealer = third + four;
        System.out.println("The dealer has " + third + " and " + four + ".\n" +
                "Dealer's total is " + totalDealer);


        if (total > totalDealer) {
            System.out.println("The user win!");
        } else {
            System.out.println("The dealer win!");
        }

    }


}
