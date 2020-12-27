package pragmaticExercises.Calculations;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class DeterminingCompoundInterest {

    private int p;
    private double r;
    private int t;
    private int n;
    private double a;


    public void doMath() {
        setA(Math.round(getP() * Math.pow(1 + ((getR() / 100) / getN()), getN() * getT()) * 100) / 100.0);
    }

    public void displayTheResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the principal amount:");
        setP(scanner.nextInt());
        System.out.println("What is the rate?");
        setR(scanner.nextDouble());
        System.out.println("What is the number of year?");
        setT(scanner.nextInt());
        System.out.println("What is the number of times the interest in compounded per year?");
        setN(scanner.nextInt());

        doMath();

        System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(getP())  + " invested at " + getR() + "% for " + getT() + " compounded " + getN() + " times per year is \n" +
                NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(getA()));
    }


    public static void main(String[] args) {
        DeterminingCompoundInterest det = new DeterminingCompoundInterest();
        det.displayTheResult();
    }



    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
