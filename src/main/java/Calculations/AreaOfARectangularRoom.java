package Calculations;

import java.util.Scanner;

public class AreaOfARectangularRoom {

    private int lenghtRoomInFeet;
    private int widthRoomInFeet;
    private double squareInMeters;
    private double squareInFeet;
    private static final double FORMULA_FOR_CONVERSION = 0.09290304;

    Scanner scanner = new Scanner(System.in);

    public void getLenghtAndWidth() {
        System.out.println("What is the lenght of the room in feet?");
        setLenghtRoomInFeet(scanner.nextInt());
        System.out.println("What is the width of the room in feet?");
        setWidthRoomInFeet(scanner.nextInt());
        System.out.println("You entered dimension of " + getLenghtRoomInFeet() + " feet by " + getWidthRoomInFeet() + " feet.");
        conversion();
    }


    public void conversion() {
        setSquareInFeet(getLenghtRoomInFeet() * getWidthRoomInFeet());
        setSquareInMeters(getSquareInFeet() * getFormulaForConversion());
        System.out.println("The area is \n" + getSquareInFeet() + " square feet \n" + ((int)Math.round(getSquareInMeters() * 100) / 100.0) + " square meters");
    }


    public static void main(String[] args) {
        AreaOfARectangularRoom area = new AreaOfARectangularRoom();
        area.getLenghtAndWidth();

    }



    public int getLenghtRoomInFeet() {
        return lenghtRoomInFeet;
    }

    public void setLenghtRoomInFeet(int lenghtRoomInFeet) {
        this.lenghtRoomInFeet = lenghtRoomInFeet;
    }

    public int getWidthRoomInFeet() {
        return widthRoomInFeet;
    }

    public void setWidthRoomInFeet(int widthRoomInFeet) {
        this.widthRoomInFeet = widthRoomInFeet;
    }

    public double getSquareInMeters() {
        return squareInMeters;
    }

    public void setSquareInMeters(double squareInMeters) {
        this.squareInMeters = squareInMeters;
    }


    public double getSquareInFeet() {
        return squareInFeet;
    }

    public void setSquareInFeet(int squareInFeet) {
        this.squareInFeet = squareInFeet;
    }

    public static double getFormulaForConversion() {
        return FORMULA_FOR_CONVERSION;
    }
}
