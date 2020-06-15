package Calculations;

import java.util.Scanner;

public class SelfCeckout {

    private String price1;
    private String quantity1;
    private String price2;
    private String quantity2;
    private String price3;
    private String quantity3;
    private double subtotal;
    private double tax;
    private double total;
    private double taxRate = 5.5;
    private double priceOfQuantity1;
    private double priceOfQuantity2;
    private double priceOfQuantity3;
    private int price11;
    private int quantity11;
    private int price22;
    private int quantity22;
    private int price33;
    private int quantity33;

    // Te rog sa nu ma injuri :))
    // Nu am prea avut inspiratie la numele variabilelor
    // Acum am inteles cat de important este ca numele variabilelor
    //sa fie cat mai concise.



    public static void main(String[] args) {
        SelfCeckout selfCeckout = new SelfCeckout();
        selfCeckout.displayResult();
    }



    public void displayResult(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of item 1:");
        setPrice1(scanner.next());
        System.out.println("Enter the quantity of item 1:");
        setQuantity1(scanner.next());
        System.out.println("Enter the price of item 2:");
        setPrice2(scanner.next());
        System.out.println("Enter the quantity of item 2:");
        setQuantity2(scanner.next());
        System.out.println("Enter the price of item 3:");
        setPrice3(scanner.next());
        System.out.println("Enter the quantity of item 3:");
        setQuantity3(scanner.next());

        convertStringToInt();
        calculation();

        System.out.println("Subtotal: " + getSubtotal());
        System.out.println("Tax: " + getTax());
        System.out.println("Total: " + getTotal());
    }



    public void calculation(){
        setPriceOfQuantity1(getPrice11() * getQuantity11());
        setPriceOfQuantity2(getPrice22() * getQuantity22());
        setPriceOfQuantity3(getPrice33() * getQuantity33());

        setSubtotal(getPriceOfQuantity1() + getPriceOfQuantity2() + getPriceOfQuantity3());

        setTax((getSubtotal() * getTaxRate()) / 100);

        setTotal(getSubtotal() + getTax());
    }


    public void convertStringToInt() {
        setPrice11(Integer.parseInt(price1));
        setQuantity11(Integer.parseInt(quantity1));
        setPrice22(Integer.parseInt(price2));
        setQuantity22(Integer.parseInt(quantity2));
        setPrice33(Integer.parseInt(price3));
        setQuantity33(Integer.parseInt(quantity3));
    }



    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public String getQuantity1() {
        return quantity1;
    }

    public void setQuantity1(String quantity1) {
        this.quantity1 = quantity1;
    }

    public String getPrice2() {
        return price2;
    }

    public void setPrice2(String price2) {
        this.price2 = price2;
    }

    public String getQuantity2() {
        return quantity2;
    }

    public void setQuantity2(String quantity2) {
        this.quantity2 = quantity2;
    }

    public String getPrice3() {
        return price3;
    }

    public void setPrice3(String price3) {
        this.price3 = price3;
    }

    public String getQuantity3() {
        return quantity3;
    }

    public void setQuantity3(String quantity3) {
        this.quantity3 = quantity3;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getPriceOfQuantity1() {
        return priceOfQuantity1;
    }

    public void setPriceOfQuantity1(double priceOfQuantity1) {
        this.priceOfQuantity1 = priceOfQuantity1;
    }

    public double getPriceOfQuantity2() {
        return priceOfQuantity2;
    }

    public void setPriceOfQuantity2(double priceOfQuantity2) {
        this.priceOfQuantity2 = priceOfQuantity2;
    }

    public double getPriceOfQuantity3() {
        return priceOfQuantity3;
    }

    public void setPriceOfQuantity3(double priceOfQuantity3) {
        this.priceOfQuantity3 = priceOfQuantity3;
    }

    public int getPrice11() {
        return price11;
    }

    public void setPrice11(int price11) {
        this.price11 = price11;
    }

    public int getQuantity11() {
        return quantity11;
    }

    public void setQuantity11(int quantity11) {
        this.quantity11 = quantity11;
    }

    public int getPrice22() {
        return price22;
    }

    public void setPrice22(int price22) {
        this.price22 = price22;
    }

    public int getQuantity22() {
        return quantity22;
    }

    public void setQuantity22(int quantity22) {
        this.quantity22 = quantity22;
    }

    public int getPrice33() {
        return price33;
    }

    public void setPrice33(int price33) {
        this.price33 = price33;
    }

    public int getQuantity33() {
        return quantity33;
    }

    public void setQuantity33(int quantity33) {
        this.quantity33 = quantity33;
    }
}
