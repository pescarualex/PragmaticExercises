package programingByDoing;

import java.util.Scanner;

public class ScannerUtils {


    public static final Scanner SCANNER = new Scanner(System.in);

    public static int readNextSingleInt() {
        int integer = SCANNER.nextInt();
        SCANNER.nextLine();
        return integer;
    }

    public static double readNextSingleDouble() {

        try {
            return SCANNER.nextDouble();
        } finally {
            SCANNER.nextLine();
        }

    }

    public static String readNextString() {
        String next = SCANNER.next();
        SCANNER.nextLine();
        return next;
    }


}
