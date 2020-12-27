package pragmaticExercises.function;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    private boolean isAnagram(char[] firstWord, char[] secondWord) {

        int word1 = firstWord.length;
        int word2 = secondWord.length;

        if (word1 != word2) {
            return false;
        }

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        for (int i = 0; i < word1; i++) {
            if (firstWord[i] != secondWord[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams\n" +
                "Enter the first string: ");
        String word1 = sc.next();
        sc.nextLine();
        System.out.println("Enter the second string: ");
        String word2 = sc.nextLine();

        char[] wordConverse = word1.toCharArray();
        char[] wordConverse2 = word2.toCharArray();
        AnagramChecker ana = new AnagramChecker();

        if (ana.isAnagram(wordConverse, wordConverse2)) {
            System.out.println("\"" + word1 + "\"" + " and " + "\"" +  word2 + "\"" + " are anagrams.");
        } else {
            System.out.println("\"" + word1 + "\"" + " and " + "\"" +  word2 + "\"" + " is not an anagrams.");

        }
    }

}
