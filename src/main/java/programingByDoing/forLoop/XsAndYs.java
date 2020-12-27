package programingByDoing.forLoop;

public class XsAndYs {
    public static void main(String[] args) {

        System.out.println("   x    y\n" +
                "------------");

        double x = -10;

        for (double i = x; i <= 10; i += 0.5) {
            System.out.println(i + "    " + Math.pow(i, 2));
        }

    }
}
