package pragmaticExercises.InputProcesingOutput;

import java.util.Scanner;

public class CountingTheNumberOfCharacters2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the input string?");
        String input = scanner.nextLine();
        System.out.println(input + " has " + input.length() + " characters.");

    }
}
