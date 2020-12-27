package programingByDoing.functions;

import programingByDoing.ScannerUtils;

public class AreaCalculator {

    public static void main(String[] args) {
        int choose = 0;

        while (choose != 5) {

            System.out.println("\tShape area calculator.\n" +
                    "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("1. Triangle\n" +
                    "2. Rectangle\n" +
                    "3. Square\n" +
                    "4. Circle\n" +
                    "5. Quit");

            choose = ScannerUtils.readNextSingleInt();

            switch (choose) {
                case 1:
                    int base, higth;
                    System.out.println("Base: ");
                    base = ScannerUtils.readNextSingleInt();
                    System.out.println("Hight: ");
                    higth = ScannerUtils.readNextSingleInt();

                    areaTriangle(base, higth);
                    break;
                case 2:
                    int lenght, width;
                    System.out.println("Lenght: ");
                    lenght = ScannerUtils.readNextSingleInt();
                    System.out.println("Width: ");
                    width = ScannerUtils.readNextSingleInt();

                    areaRectangle(lenght, width);
                    break;
                case 3:
                    int side;
                    System.out.println("Side:");
                    side = ScannerUtils.readNextSingleInt();

                    areaSquare(side);
                    break;
                case 4:
                    int radius;
                    System.out.println("Radius: ");
                    radius = ScannerUtils.readNextSingleInt();

                    areaCircle(radius);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Try again!");
                    choose = ScannerUtils.readNextSingleInt();
                    break;
            }


        }
    }


    public static double areaTriangle(int base, int higth) {
        double total = (base * higth) / 2;
        System.out.println("The area is " + total);

        return total;
    }

    public static int areaRectangle(int lenght, int width) {
        int total = lenght * width;
        System.out.println("The area is " + total);

        return total;
    }

    public static double areaSquare(int side) {
        double total = Math.pow(side, 2);

        System.out.println("The area is " + total);
        return total;
    }

    public static double areaCircle(int radius) {
        double total = Math.PI * Math.pow(radius, 2);
        System.out.println("The area is " + total);

        return total;
    }


}
