package programingByDoing.arrays;

import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int slot;

        String[] lastNames = {"Mitchel", "Ortiz", "Luu", "Zimmerman", "Brooks"};
        double[] grades = {99.5, 78.5, 95.6, 96.8, 82.7};
        int[] studentIds = {1234, 2345, 3456, 4567, 5678};

        System.out.println("Values: \n" +
                "\tName | Grade | StudentId\n" +
                "\t------------------------");
        for (int i = 0; i < lastNames.length; i++) {
            System.out.println("\t" + lastNames[i] + " | " + grades[i] + " | " + studentIds[i]);
        }

        System.out.print("\nID number to find: ");
        int idNum = sc.nextInt();

        for (int j = 0; j < studentIds.length; j++) {
            if (studentIds[j] == idNum) {
                slot = j;
                System.out.println("Found in slot " + slot + "\n" +
                        "\tName: " + lastNames[slot] + "\n" +
                        "\tAverage: " + grades[slot] + "\n" +
                        "\tID: " + studentIds[slot]);
                break;
            }
        }


    }
}
