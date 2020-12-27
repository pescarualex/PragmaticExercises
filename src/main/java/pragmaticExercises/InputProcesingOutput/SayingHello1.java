package pragmaticExercises.InputProcesingOutput;

import java.util.Scanner;

public class SayingHello1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What it's your name?");
        String name = scanner.nextLine();
        System.out.println("hello, " + name + ", nice to meet you!");

    }
}
