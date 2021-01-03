package programingByDoing.nestedLoops;

public class BasicNestedLoops {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {

                System.out.print("(" + i + "," + j + ")");

                if (j % 7 == 0) {
                    System.out.println();
                }
            }
        }

    }
}
