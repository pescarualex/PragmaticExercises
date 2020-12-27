package programingByDoing.forLoop;

import programingByDoing.ScannerUtils;

public class AddingValuesEithForLoop {
    public static void main(String[] args) {

        System.out.print("Number: ");
        int input = ScannerUtils.readNextSingleInt();
        int total = 0;

        for (int i = 1; i <= input; i++) {
            System.out.print(i + " ");
            total += i;
        }

        System.out.println();
        System.out.println("The sum is " + total);

    }
}
