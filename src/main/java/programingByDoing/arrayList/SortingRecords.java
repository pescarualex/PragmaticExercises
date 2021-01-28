package programingByDoing.arrayList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Car {
    String make;
    String model;
    int year;
    String licence;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", licence='" + licence + '\'' +
                '}';
    }
}

public class SortingRecords {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("From which file do you want to load this info: ");
        String fileChosen = scanner.next();
        scanner.close();

        File file = new File("src/main/java/programingByDoing/arrayList/" + fileChosen);
        Scanner sc = new Scanner(file);


        List<Car> cars = new ArrayList<Car>();
        int i = 0;
        while (sc.hasNext()){
            cars.add(i, new Car());
            cars.get(i).make = sc.next();
            cars.get(i).model = sc.next();
            cars.get(i).year = sc.nextInt();
            cars.get(i).licence = sc.next();
            i++;
        }

        scanner.close();

        sort(cars);

        for (int j = 0; j < cars.size(); j++) {
            System.out.println("Cars " + (j + 1));
            System.out.println("\tModel: " + cars.get(j).make);
            System.out.println("\tMake: " + cars.get(j).model);
            System.out.println("\tYear: " + cars.get(j).year);
            System.out.println("\tLicense: " + cars.get(j).licence);
        }
    }

    public static void sort(List<Car> cars) {
        Car temp;
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.size(); j++) {
                if (cars.get(i).year < cars.get(j).year) {
                    temp = cars.get(i);
                    cars.set(i, cars.get(j));
                    cars.set(j, temp);

                }
            }
        }

    }
}



