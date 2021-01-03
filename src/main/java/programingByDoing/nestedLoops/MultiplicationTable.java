package programingByDoing.nestedLoops;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
                if (j % 12 == 0) {
                    System.out.print("");
                }
            }
            System.out.print("\t");
        }

    }

}
