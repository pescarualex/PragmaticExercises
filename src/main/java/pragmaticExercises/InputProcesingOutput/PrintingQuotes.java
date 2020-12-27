package pragmaticExercises.InputProcesingOutput;

import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the quote?");
        String quote = scanner.nextLine();
        System.out.println("Who said it?");
        String nameOfPerson = scanner.nextLine();

        System.out.println(nameOfPerson + " says, \"" + quote + "\"");
    }
}
