package Calculations;

import java.util.Scanner;

public class PaintCalculator {

    private int lenght;
    private int width;
    private double area;
    private static double galonCover = 350;
    private static int roundGalon;



    public void calculation() {
        setArea(getLenght() * getWidth());
        PaintCalculator paint = new PaintCalculator();
        setRoundGalon((int) Math.ceil(getArea() / getGalonCover()));
    }

    public void displayTheResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lenght: ");
        setLenght(scanner.nextInt());
        System.out.println("Width: ");
        setWidth(scanner.nextInt());

        calculation();

        System.out.println("You will need to purchase " + getRoundGalon() + " \n" +
                            "of paint to cover " + getArea() + " square feet.");
    }


    public static void main(String[] args) {
        PaintCalculator paintCalculator = new PaintCalculator();
        paintCalculator.displayTheResult();
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    //read-only
    public static double getGalonCover() {
        return galonCover;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public static double getRoundGalon() {
        return roundGalon;
    }

    public static void setRoundGalon(int roundGalon) {
        PaintCalculator.roundGalon = roundGalon;
    }
}
