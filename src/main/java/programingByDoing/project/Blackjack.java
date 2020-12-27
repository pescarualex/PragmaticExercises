package programingByDoing.project;

import programingByDoing.ScannerUtils;

import java.util.concurrent.ThreadLocalRandom;

public class Blackjack {

    static int userTotal = 0;
    static int dealerTotal = 0;
    String answer;


    private void userTurn() throws InterruptedException {
        do {
            System.out.println("Would you like to \"hit\" or \"stay\"?");
            answer = ScannerUtils.readNextString();
            if (answer.equalsIgnoreCase("hit")) {
                int hit = ThreadLocalRandom.current().nextInt(2, 11);
                System.out.println("You drew " + hit);
                userTotal += hit;
                System.out.println("Your total is " + userTotal);
                if (userTotal >= 21) {
                    System.out.println("The dealer win!");
                    System.exit(0);
                }
            } else if (answer.equalsIgnoreCase("stay")) {
                System.out.println("Okey, dealer's  turn.");
                dealerTurn();
            } else {
                System.out.println("Your answer is wrong. Try again: ");
                userTurn();
            }
        } while (!answer.equalsIgnoreCase("stay"));
    }

    private void dealerTurn() throws InterruptedException {
        do {
            int hit = ThreadLocalRandom.current().nextInt(2, 11);
            System.out.println("Dealer hit, he draw " + hit);
            dealerTotal += hit;
            System.out.println("His total is " + dealerTotal);
            if (dealerTotal >= 21) {
                System.out.println("The user win!");
                System.exit(0);
            }
            Thread.sleep(400);
        } while (dealerTotal <= 17);
    }




    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n" +
                "\t---Welcome to Blackjack!---");

        Blackjack bj = new Blackjack();
        bj.userTurn();

        System.out.println();

        if (userTotal > dealerTotal && userTotal < 21) {
            System.out.println("The user win!");
        } else if (dealerTotal >= userTotal && dealerTotal < 21) {
            System.out.println("The dealer win!");
        }

    }
}
