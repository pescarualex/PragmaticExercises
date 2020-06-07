package InputProcesingOutput;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String noun = scanner.nextLine();
        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();
        System.out.println("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.println("If you are a " + noun + " and your mind is " + adjective + ", it's funny because the " + verb + " are the expensive tool for " + adverb);
    }
}
