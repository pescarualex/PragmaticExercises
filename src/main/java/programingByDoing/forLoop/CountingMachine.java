package programingByDoing.forLoop;

import programingByDoing.ScannerUtils;

public class CountingMachine {
    public static void main(String[] args) {
        System.out.print("Count to: ");
        int count = ScannerUtils.readNextSingleInt();

        for (int i = 0; i <= count; i++)
            System.out.print(i + " ");
    }
}
