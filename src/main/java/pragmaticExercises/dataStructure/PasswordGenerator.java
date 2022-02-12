package pragmaticExercises.dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        List<String> letters = new ArrayList<>();
        List<String> characters = new ArrayList<>();
        List<String> numbers = new ArrayList<>();

        String letter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String character = "~`!@#$%^&*()_+}{[]|':;<>?/.,';";
        String digit = "1234567890";

        for (char lett : letter.toCharArray()) {
            String lettAsString = String.valueOf(lett);
            letters.add(lettAsString);
        }

        for (char ch : character.toCharArray()) {
            String chAsString = String.valueOf(ch);
            characters.add(chAsString);
        }

        for (char dig : digit.toCharArray()) {
            String digAsString = String.valueOf(dig);
            numbers.add(digAsString);
        }


        System.out.println("What's the minimum lenght?");
        int minimumLenght = sc.nextInt();
        System.out.println("How many special character?");
        int charCountainLenght = sc.nextInt();
        System.out.println("How many number?");
        int numberLenght = sc.nextInt();


        char special = 0;
        char num = 0;
        char let = 0;


        System.out.println("Your password is: ");

        for (int i = 0; i < charCountainLenght; i++) {
            special = character.charAt(rand.nextInt(characters.size()));
            System.out.print(special);

            num = digit.charAt(rand.nextInt(numbers.size()));
            System.out.print(num);

            let = letter.charAt(rand.nextInt(letters.size()));
            System.out.print(let);
        }




    }
}
