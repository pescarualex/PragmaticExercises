package programingByDoing.records;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Car {
    String make;
    String model;
    int yearOfMade;
    String licensePlate;
}

public class StoringDataInAFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = null;

        Car[] cars = new Car[5];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println("Car " + (i + 1));
            System.out.print("\tMake: ");
            cars[i].make = sc.next();

            System.out.print("\tModel: ");
            cars[i].model = sc.next();

            System.out.print("\tYear: ");
            cars[i].yearOfMade = sc.nextInt();

            System.out.print("\tLicense: ");
            cars[i].licensePlate = sc.next();
        }

        System.out.print("\nTo which file do you want to save this info: ");
        String fileToWrite = sc.next();
        if (fileToWrite.equalsIgnoreCase("cars.txt")) {
            bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/programingByDoing/records/cars.txt"));
        }

        for (int i = 0; i < cars.length; i++) {
            assert bufferedWriter != null;
            bufferedWriter.write(cars[i].make + " " + cars[i].model + " " + cars[i].yearOfMade + " " + cars[i].licensePlate);
            bufferedWriter.newLine();
        }

        System.out.println("Data Saved.");
        sc.close();
        bufferedWriter.close();


    }

}
