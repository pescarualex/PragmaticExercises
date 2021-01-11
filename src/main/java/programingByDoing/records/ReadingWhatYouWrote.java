package programingByDoing.records;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Car1 {
    String make;
    String model;
    int year;
    String license;

}

public class ReadingWhatYouWrote {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        Car1 temp;

        System.out.print("From which file do tou want to load this info: ");
        String fileToRead = sc.next();

        File file = new File("src/main/java/programingByDoing/records/" + fileToRead);
        Scanner scanner = new Scanner(file);

        Car1[] cars = new Car1[5];

        while (scanner.hasNext()) {
                cars[i] = new Car1();
                cars[i].make = scanner.next();
                cars[i].model = scanner.next();
                cars[i].year = scanner.nextInt();
                cars[i].license = scanner.next();
            i++;
        }

        //here i am sorted the array by year of production
        /*for (int k = 0; k < cars.length; k++) {
            for (int l = 0; l < cars.length; l++) {
                if (cars[k].year < cars[l].year) {
                    temp = cars[k];
                    cars[k] = cars[l];
                    cars[l] = temp;
                }
            }
        }*/

        //here sorting array by make(string)
        for (int k = 0; k < cars.length; k++) {
            for (int l = 0; l < cars.length; l++) {
                if (cars[k].make.compareTo(cars[l].make) < 0) {
                    Car1 tmp = cars[k];
                    cars[k] = cars[l];
                    cars[l] = tmp;
                }
            }
        }

        sc.close();
        scanner.close();

        System.out.println("Data loud..");

        for (int j = 0; j < cars.length; j++) {
            System.out.println("Cars " + (j + 1));
            System.out.println("\tMake: " + cars[j].make);
            System.out.println("\tModel: " + cars[j].model);
            System.out.println("\tYear: " + cars[j].year);
            System.out.println("\tLicense: " + cars[j].license);
        }
    }
}
