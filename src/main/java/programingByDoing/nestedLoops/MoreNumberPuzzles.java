package programingByDoing.nestedLoops;

import programingByDoing.ScannerUtils;

public class MoreNumberPuzzles {
    public static void main(String[] args) {
        int quit = 3;
        int find;
        do {
            System.out.println("1. Find two digit numbers <= 56 with sums of digits > 10\n" +
                    "2. Find two digit number minus number inversed wich equals sum of digits\n" +
                    "3. Quit");
            find = ScannerUtils.readNextSingleInt();

            if (find == 1) {
                fiftySix();
            } else if (find == 2) {
                sameSumDigit();
            } else {
                System.out.println();
            }
        } while (find != quit);

    }


    static void fiftySix() {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (((i * 10) + j <= 56) && i + j > 10) {
                    System.out.println(i + "" + j);
                }
            }
        }
    }

    static void sameSumDigit() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (((i * 10) + j) - ((j * 10) + (i)) == ((i) + j))  {
                    System.out.println((i * 10) + j);
                }
            }
        }
    }



}
