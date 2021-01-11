package programingByDoing.records;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

class Person {
    String name;
    int age;
}

public class MoreDataFromFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = null;
        System.out.println("Wich file to open: ");
        String fileToOpen = sc.next();

        if (fileToOpen.equalsIgnoreCase("name_age.txt")) {
            scanner = new Scanner(Paths.get("src/main/java/programingByDoing/records/name_age.txt"));
        }

        Person[] persons = new Person[5];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            persons[i].name = scanner.next();
            persons[i].age = scanner.nextInt();

            System.out.println(persons[i].name + " is " + persons[i].age);
        }

    }
}
