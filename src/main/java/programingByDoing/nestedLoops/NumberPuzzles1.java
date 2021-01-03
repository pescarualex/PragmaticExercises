package programingByDoing.nestedLoops;

public class NumberPuzzles1 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (i + j == 60 && j - i == 14 || j + i == 60 && i - j == 14) {
                    System.out.println(i + " + " + j + " = " + (i+j));
                }
            }
        }
    }
}
