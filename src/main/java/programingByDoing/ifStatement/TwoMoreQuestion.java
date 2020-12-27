package programingByDoing.ifStatement;

import java.util.Scanner;

public class TwoMoreQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("TWO MORE QUESTION, BABY!");
        System.out.println();
        System.out.println("Think of something and I'll try to guess it.");
        System.out.println();
        System.out.println("1. Does it stay inside or outside or both?");
        String iOrOOrB = sc.next();
        System.out.println("Is it alive?");
        String aliveOrNot = sc.next();

        if (iOrOOrB.equalsIgnoreCase("Outside") && aliveOrNot.equalsIgnoreCase("yes")) {
            System.out.println("Then what else could you be thinking of beside a bison?");
        }
        if (iOrOOrB.equalsIgnoreCase("outside") && aliveOrNot.equalsIgnoreCase("no")) {
            System.out.println("Then what else could you be thinking of beside a billboard?");
        }
        if (iOrOOrB.equalsIgnoreCase("inside") && aliveOrNot.equalsIgnoreCase("yes")) {
            System.out.println("Then what else could you be thinking of beside a hauseplant?");
        }
        if (iOrOOrB.equalsIgnoreCase("inside") && aliveOrNot.equalsIgnoreCase("no")) {
            System.out.println("Then what else could you be thinking of beside a shower curtain?");
        }
        if (iOrOOrB.equalsIgnoreCase("both") && aliveOrNot.equalsIgnoreCase("yes")) {
            System.out.println("Then what else could you be thinking of beside a dog?");
        }
        if (iOrOOrB.equalsIgnoreCase("both") && aliveOrNot.equalsIgnoreCase("no")) {
            System.out.println("Then what else could you be thinking of beside a cell phone?");
        }

    }


}
