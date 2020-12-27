package pragmaticExercises.dataStructure;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {


    private static void randomAns(String getInput) {
        Scanner sc = new Scanner(System.in);

        String[] randomAnswer = new String[4];

        randomAnswer[0] = "Yes";
        randomAnswer[1] = "No";
        randomAnswer[2] = "Maybe";
        randomAnswer[3] = "Ask again later";

        Random random = new Random();

        String getTheRandomValue = randomAnswer[random.nextInt(randomAnswer.length)];
        System.out.println(getTheRandomValue);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your question?");
        String getInput = sc.nextLine();

        randomAns(getInput);
    }

}
