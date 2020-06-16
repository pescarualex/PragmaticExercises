package Calculations;

import java.util.Scanner;

public class CurrencyConversion {

    private double amountTo;
    private double amountFrom;
    private double rateFrom;
   // private double rateTo;

    // te rog sa-mi dai un feedback la asta..
    // reusesc sa implementez formula dar nu stiu la ce se refera rateTo
    // daca inmultesc amountFrom(amount in euros) cu rateFrom(exchange rate in euros) si impart la rateTo(exchange rate of the US dollars) nu este corect
    // daca fac invers, nici asa
    // singura metoda de a afisa raspunsul corect este asta
    // te rog sa ma corectezi daca gresesc

    public void theMath(){
        setAmountTo(Math.round((getAmountFrom() * getRateFrom()) * 1000) / 1000.0);
    }

    public void displayTheResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        setAmountFrom(scanner.nextInt());
        System.out.println("What is the exchange rate?");
        setRateFrom(scanner.nextDouble());

        theMath();

        System.out.println(getAmountFrom() + " euros at an exchange rate \n" +
                "of " + getRateFrom() + " is " + getAmountTo() + " U.S. dollars.");
    }

    public static void main(String[] args) {
        CurrencyConversion currencyConversion = new CurrencyConversion();
        currencyConversion.displayTheResult();
    }





    public double getAmountTo() {
        return amountTo;
    }

    public void setAmountTo(double amountTo) {
        this.amountTo = amountTo;
    }

    public double getAmountFrom() {
        return amountFrom;
    }

    public void setAmountFrom(double amountFrom) {
        this.amountFrom = amountFrom;
    }

    public double getRateFrom() {
        return rateFrom;
    }

    public void setRateFrom(double rateFrom) {
        this.rateFrom = rateFrom;
    }

//    public double getRateTo() {
//        return rateTo;
//    }
//
//    public void setRateTo(double rateTo) {
//        this.rateTo = rateTo;
//    }
}
