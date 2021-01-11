package programingByDoing.records;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

class Dog {
    String breed;
    int age;
    int weight;
}

public class GettingDataFromAFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = null;
        System.out.println("Wich file to open: ");
        String fileToOpen = sc.next();
        if (fileToOpen.equalsIgnoreCase("dogs.txt")) {
            scanner = new Scanner(Paths.get("src/main/java/programingByDoing/records/dogs.txt"));
        }
        System.out.println("Reading data from " + fileToOpen);


        Dog firstDog = new Dog();
        firstDog.breed = scanner.next();
        firstDog.age = scanner.nextInt();
        firstDog.weight = scanner.nextInt();
        System.out.println("First dog: " + firstDog.breed + ", " + firstDog.age + ", " + firstDog.weight);

        Dog secondDog = new Dog();
        secondDog.breed = scanner.next();
        secondDog.age = scanner.nextInt();
        secondDog.weight = scanner.nextInt();
        System.out.println("Second dog: " + secondDog.breed + ", " + secondDog.age + ", " + secondDog.weight);

    }
}
