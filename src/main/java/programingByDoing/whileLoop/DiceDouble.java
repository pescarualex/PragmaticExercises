package programingByDoing.whileLoop;

import java.util.Random;

public class DiceDouble {

    public static void main(String[] args) {
        Random r = new Random();
        int oneDice = r.nextInt(6);
        int twoDice = r.nextInt(6);

        while (oneDice != twoDice) {
            oneDice = r.nextInt(6);
            twoDice = r.nextInt(6);
            int totalOfDice = oneDice + twoDice;

            System.out.println("Roll #1: " + oneDice);
            System.out.println("Roll #2: " + twoDice);
            System.out.println("The total is: " + totalOfDice);
            System.out.println();
        }
    }


}
