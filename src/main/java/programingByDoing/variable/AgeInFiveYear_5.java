package programingByDoing.variable;

import java.util.Scanner;

public class AgeInFiveYear_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        int ageInFiveYear;
        int ageLessFiveYear;

        System.out.println("Hello! What is your name?");
        name = sc.next();
        System.out.println("Hi, " + name + "! How old are you?");
        age = sc.nextInt();

        ageInFiveYear = age + 5;
        ageLessFiveYear = age - 5;

        System.out.println("Did you know that in five year you will be " + ageInFiveYear + "?\n" +
                "And five year age you were " + ageLessFiveYear + "! Imagine that!");

    }


}
