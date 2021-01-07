package programingByDoing.fileInputAndOutput;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SummingThreeNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(Paths.get("src/main/java/programingByDoing/fileInputAndOutput/3nums.txt"));

        int t = sc.nextInt();
        int r = sc.nextInt();
        int w = sc.nextInt();

        int sum = t + r + w;
        System.out.println(t + " + " + r + " + " + w + " = " + sum );

    }
}
