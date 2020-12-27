package programingByDoing.forLoop;

import programingByDoing.ScannerUtils;

public class CountingWithAForLoop {

    public static void main(String[] args) {

        System.out.println("Type in a message, and I'll display it five times.\n" +
                "Message: ");
        String message = ScannerUtils.readNextString();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". " + message);
        }

    }


}
