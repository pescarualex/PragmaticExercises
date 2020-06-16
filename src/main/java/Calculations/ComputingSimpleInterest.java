package Calculations;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ComputingSimpleInterest {

    private int principalAmount;
    private double annualRateOfInterest;
    private int numberOfYear;
    private double amountAtTheEnd;


    public void doMath(){
        setAmountAtTheEnd(Math.round(getPrincipalAmount() * (1 + ((getAnnualRateOfInterest() / 100) * getNumberOfYear()))));
    }

    public void displayTheResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        setPrincipalAmount(scanner.nextInt());
        System.out.println("Enter the rate of interest: ");
        setAnnualRateOfInterest(scanner.nextDouble());
        System.out.println("Enter the number of year: ");
        setNumberOfYear(scanner.nextInt());

        doMath();

        System.out.println("After " + getNumberOfYear() + " years at " + getAnnualRateOfInterest() + "%, the investment will be worth \n" +
                NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(getAmountAtTheEnd()));
    }


    public static void main(String[] args) {
        ComputingSimpleInterest interest = new ComputingSimpleInterest();
        interest.displayTheResult();
    }






    public int getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(int principalAmount) {
        this.principalAmount = principalAmount;
    }

    public double getAnnualRateOfInterest() {
        return annualRateOfInterest;
    }

    public void setAnnualRateOfInterest(double annualRateOfInterest) {
        this.annualRateOfInterest = annualRateOfInterest;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    public double getAmountAtTheEnd() {
        return amountAtTheEnd;
    }

    public void setAmountAtTheEnd(double amountAtTheEnd) {
        this.amountAtTheEnd = amountAtTheEnd;
    }
}
