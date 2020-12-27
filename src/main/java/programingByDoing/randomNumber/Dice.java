package programingByDoing.randomNumber;

import java.util.Random;

public class Dice {

    public static void main(String[] args) {

        System.out.println("HERE COMES THE DICE!");
        System.out.println();

        Random r = new Random();
        int num1 = 1 + r.nextInt(6);
        int num2 = 1 + r.nextInt(6);

        int sumOfNum = num1 + num2;

        System.out.println("Roll #1:" + num1);
        System.out.println("Roll #2:" + num2);
        System.out.println("The total is: " + sumOfNum);


    }
}
