package programingByDoing.variable;

import java.util.Scanner;

public class AskingQuestion_1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        int height;
        int weight;

        System.out.println("How old are you?");
        age = sc.nextInt();

        System.out.println("How tall are you?");
        height = sc.nextInt();

        System.out.println("How much do you weight?");
        weight = sc.nextInt();

        System.out.println("You are " + age + " old, " + height + " cm tall and " + weight + " kilo heavy");
    }



}
