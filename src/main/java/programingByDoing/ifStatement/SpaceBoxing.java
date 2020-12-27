package programingByDoing.ifStatement;

import java.util.Scanner;

public class SpaceBoxing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your current earth weight:");
        double weightOnEarth = sc.nextDouble();

        System.out.println("I have info for the following planets:\n" +
                "   1. Venus    2. Mars     3. Jupiter\n" +
                "   4. Saturn   5. Uranus   6. Neptune\n" +
                "Witch planet are you visiting?");
        int numOfPlanet = sc.nextInt();
        double weightOnAnotherPlanet = 0;

        if (numOfPlanet == 1) {
             weightOnAnotherPlanet = weightOnEarth * 0.78;
            System.out.println(weightOnAnotherPlanet);
        } else if (numOfPlanet == 2) {
             weightOnAnotherPlanet = weightOnEarth * 0.39;
            System.out.println(weightOnAnotherPlanet);
        } else if (numOfPlanet == 3) {
             weightOnAnotherPlanet = weightOnEarth * 2.65;
            System.out.println(weightOnAnotherPlanet);
        } else if (numOfPlanet == 4) {
             weightOnAnotherPlanet = weightOnEarth * 1.17;
            System.out.println(weightOnAnotherPlanet);
        } else if (numOfPlanet == 5) {
            weightOnAnotherPlanet = weightOnEarth * 1.05;
            System.out.println(weightOnAnotherPlanet);
        } else if (numOfPlanet == 6) {
            weightOnAnotherPlanet = weightOnEarth * 1.23;
            System.out.println(weightOnAnotherPlanet);
        }

        System.out.println("Your weight would be " + weightOnAnotherPlanet + " kilo on that planet.");


    }
}
