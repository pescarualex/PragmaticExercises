package programingByDoing.forLoop;

public class CountingByHalves {
    public static void main(String[] args) {

        System.out.println("  x\n" +
                "-----");

        double x = -10;

        for (double i = x; i <= 10; i += 0.5) {
            System.out.println(i);
        }

    }

}
