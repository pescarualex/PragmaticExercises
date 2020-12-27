package programingByDoing.variable;

import java.util.Scanner;

public class TheForghetfulMachine_2 {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a word!");
        keyboard.next();
        System.out.println("Give me another word!");
        keyboard.next();
        System.out.println("Now, give me a number:");
        keyboard.nextInt();
        System.out.println("Give me another number:");
        keyboard.nextInt();

        System.out.println("Well done!!");

    }
}
