package programingByDoing.forLoop;

import programingByDoing.ScannerUtils;

public class CountingMachineRevisited {
    public static void main(String[] args) {

        System.out.println("Count from: ");
        int countFrom = ScannerUtils.readNextSingleInt();
        System.out.println("Count to: ");
        int countTo = ScannerUtils.readNextSingleInt();
        System.out.println("Count by: ");
        int countBy = ScannerUtils.readNextSingleInt();


        for (int i = countFrom; i <= countTo; i += countBy) {
            System.out.print(i + " ");
        }
    }
}
