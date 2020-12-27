package programingByDoing.forLoop;

import programingByDoing.ScannerUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LetterAtATime {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int countA = 0;

        System.out.println("What is your message?");
        String message = bfr.readLine();

        System.out.println("Your message is " + message.length() + " character long.\n" +
                "The first character is at position 0 and is '" + message.charAt(0) + "'.\n" +
                "The last character is at position " + message.length() + " and is " + message.charAt(message.length() - 1) + "\n" +
                "Here are all the caracters, one at a time: ");

        for (int i = 0; i < message.length(); i++) {
            System.out.println("\t" + i + " - '" + message.charAt(i) + "'");

            char c = message.charAt(i);

            if (c == 'a' || c == 'A') {
                countA++;
            }
        }

        System.out.println("Your message countain letter 'a' " + countA + ".");








    }
}
