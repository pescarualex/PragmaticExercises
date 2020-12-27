package programingByDoing.ifStatement;

import java.util.Scanner;

public class WeekdayName {

    public static String weekdayName(int numberOfTheDay) {
        String day = null;

        if (numberOfTheDay == 1) {
            day = "Mondey";
            System.out.println(day);
        } else if (numberOfTheDay == 2) {
            day = "Tuesday";
            System.out.println(day);
        } else if (numberOfTheDay == 3) {
            day = "Wednesday";
            System.out.println(day);
        } else if (numberOfTheDay == 4) {
            day = "Thursday";
            System.out.println(day);
        } else if (numberOfTheDay == 5) {
            day = "Fruday";
            System.out.println(day);
        } else if (numberOfTheDay == 6) {
            day = "Saturday";
            System.out.println(day);
        } else if (numberOfTheDay == 7) {
            day = "Sunday";
            System.out.println(day);
        } else {
            System.out.println("This day not exist");
        }

        return day;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a number and I will say the weekday: ");
        int num = sc.nextInt();
        weekdayName(num);
    }
}
