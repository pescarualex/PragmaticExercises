package programingByDoing.forLoop;

import java.util.Scanner;

public class DisplayingSomeMultyples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            int multiplication = num * i;
            System.out.println(num + " * " + i + " = " + multiplication);

        }
        sc.close();
    }
}
