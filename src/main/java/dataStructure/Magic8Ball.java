package dataStructure;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Magic8Ball {



    private static void randomAns() {
        Scanner sc = new Scanner(System.in);

        String[] randomAnswer = new String[4];

        randomAnswer[0] = "Yes";
        randomAnswer[1] = "No";
        randomAnswer[2] = "Maybe";
        randomAnswer[3] = "Ask again later";

        Random random = new Random();

        System.out.println("What is your question?");
        String getInput = sc.nextLine();

        String getTheRandomValue = randomAnswer[random.nextInt(randomAnswer.length)];
        System.out.println(getTheRandomValue);

    }

    public static void main(String[] args) {
        randomAns();
    }

}
