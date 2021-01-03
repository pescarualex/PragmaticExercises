package programingByDoing.nestedLoops;

import java.util.Scanner;

public class OdometerLoops {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int base = 10;

        System.out.print("Wich base: (2-10)  ");
        int choose = sc.nextInt();

        if (choose == 2) {
            base = 8;
        }


        for (int thous = 0; thous < base; thous++) {
            for (int hund = 0; hund < base; hund++) {
                for (int tens = 0; tens < base; tens++) {
                    for (int ones = 0; ones < base; ones++) {
                        System.out.print(" " + thous + "" + hund + "" + tens + "" + ones + "\r");
                        Thread.sleep(500);
                    }
                }
            }
        }

        System.out.println();
    }
}
