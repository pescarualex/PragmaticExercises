package programingByDoing.ifStatement;

import java.util.Scanner;

public class TwentyQuestionActuallyJustTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Two question!\n" +
                "Think of an object and I'll try to guess it.");
        System.out.println();
        System.out.println("Q1. Is it animal, vegetable or mineral?");
        String qOne = sc.next();
        System.out.println("Q2. Is it bigger than a beardbox?");
        String qTwo = sc.next();

        if (qOne.equalsIgnoreCase("animal")) {
            if (qTwo.equalsIgnoreCase("yes")) {
                System.out.println("My guess is that you are thinking of a mouse\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            } else if (qTwo.equalsIgnoreCase("no")) {
                System.out.println("My guess is that you are thinking of a squirrel\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            }
        } else if (qOne.equalsIgnoreCase("vegetable")) {
            if (qTwo.equalsIgnoreCase("yes")) {
                System.out.println("My guess is that you are thinking of a watermelon\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            } else if (qTwo.equalsIgnoreCase("no")) {
                System.out.println("My guess is that you are thinking of a carrot\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            }
        } else if (qOne.equalsIgnoreCase("mineral")) {
            if (qTwo.equalsIgnoreCase("yes")) {
                System.out.println("My guess is that you are thinking of a camaro\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            } else if (qTwo.equalsIgnoreCase("no")) {
                System.out.println("My guess is that you are thinking of a paper clip\n" +
                        "I would ask you if I'm right, but I don't actually care.");
            }
        } else {
            System.out.println("I don't care about your answer!! _|_ =))");
        }


    }



}
