package programingByDoing.fileInputAndOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HightScore {
    public static void main(String[] args) throws IOException {
        System.out.print("You got a hight score!\n" +
                "Please enter your name: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("Please entrer your score: ");
        int score = sc.nextInt();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/programingByDoing/fileInputAndOutput/score.txt"));
        bufferedWriter.newLine();
        bufferedWriter.write(name + ": " + score);

        System.out.println("\nData stored into score.txt.");
        bufferedWriter.close();
        sc.close();

    }
}
