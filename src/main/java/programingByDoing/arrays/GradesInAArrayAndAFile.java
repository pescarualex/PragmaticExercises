package programingByDoing.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GradesInAArrayAndAFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = null;

        System.out.print("Name (first and last): ");
        String name = sc.nextLine();
        System.out.print("File name: ");
        String filename = sc.next();

        if (filename.equalsIgnoreCase("ettu.txt")) {
            bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/programingByDoing/arrays/ettu.txt"));
        }

        int[] arr = new int[5];
        System.out.println("Here are your randomly-selected grades (hope you pass):");
        for (int num = 0; num < arr.length; num++) {
            arr[num] = ThreadLocalRandom.current().nextInt(1, 100);
            System.out.println("Grade " + (num + 1) + ": " + arr[num]);
        }

        bufferedWriter.write(name);
        bufferedWriter.newLine();

        for (int i = 0; i < arr.length; i++) {
            bufferedWriter.write(arr[i] + " ");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        sc.close();

        System.out.println("Data saved in " + filename);



    }
}
