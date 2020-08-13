package repetition;

import java.util.Scanner;

public class KarvonenHeartRate {

    public static void main(String[] args) {

        int targetHeartRate;
        int restingHR;
        int intensity;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the resting pulse:");
        restingHR = sc.nextInt();
        System.out.println("Enter the age:");
        age = sc.nextInt();

        System.out.print("Resting pulse: " + restingHR + "     ");
        System.out.println("Age: " + age);
        System.out.println();
        System.out.println("Intensity     | Rate     ");
        System.out.println("_____________________");

        for (intensity = 55; intensity <= 95; intensity += 5) {
            targetHeartRate = (((220 - age) - restingHR) * intensity / 100) + restingHR;

            System.out.println(intensity + "%           | " + targetHeartRate);

        }




    }


}
