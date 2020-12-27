package programingByDoing.functions;

import programingByDoing.ScannerUtils;

public class KeychainsForSale {

    static int storeKey = 0;
    static int price = 10;
    static double salesTax = 8.25;
    static int shippingCost = 5;
    static int additionalShipingCost = 1;


    public static void main(String[] args) {

        int choose = 0;


        while (choose != 4) {
            System.out.println("1. Add Keychains to Order\n" +
                    "2. Remove Keychains from order\n" +
                    "3. View current order\n" +
                    "4. Checkout");
            System.out.print("Please enter your choise: ");
            choose = ScannerUtils.readNextSingleInt();

            switch (choose) {
                case 1:
                    addKeychain(storeKey);
                    break;
                case 2:
                    removeKaychain(storeKey);
                    break;
                case 3:
                    viewKeychain(storeKey, price, salesTax, shippingCost, additionalShipingCost);
                    break;
                case 4:
                    checkout(storeKey, price, salesTax, shippingCost, additionalShipingCost);
                    break;
                default:
                    System.out.println("Enter a valid option: ");
                    choose = ScannerUtils.readNextSingleInt();
            }
        }



    }

    public static int addKeychain(int key) {
        System.out.print("You have " + key + " keychains. How many to add?\n" +
                ">");
        int addKey = ScannerUtils.readNextSingleInt();
        if (addKey < 0) {
            System.out.println("This is not posible. Try again: ");
            addKeychain(key);
        }
        storeKey += addKey;
        System.out.println("Now you have " + storeKey + " keychains.");

        return storeKey;
    }

    public static int removeKaychain(int key) {
        System.out.print("You have " + key + " keychains. How many to remove?\n" +
                ">");
        int removeKey = ScannerUtils.readNextSingleInt();
        storeKey -= removeKey;
        System.out.println("Now you have " + storeKey + " keychains.");

        return storeKey;
    }

    public static void viewKeychain(int key, int price, double salesTax, int shippingCost, int additionalShipingCost) {
        System.out.println("You have " + key + " keychains.\n" +
                "Keychains cost $" + price + " each.\n" +
                "Shipping cost is $" + shippingCost + ".\n" +
                "The additional cost per keychain is $" + additionalShipingCost);
        int subtotal = (key * price) + shippingCost + (key * additionalShipingCost);
        System.out.println("The subtotal is $" + subtotal);

        double tax = Math.round((subtotal / salesTax) * 100) / 100.0;

        System.out.println("The tax for this order is $" + tax);

        double total = Math.round((subtotal + tax) * 100) / 100.0;

        System.out.println("Total cost is $" + total);
    }

    public static void checkout(int key, int price, double salesTax, int shippingCost, int additionalShipingCost) {
        System.out.println("What is your name?");
        String name = ScannerUtils.readNextString();
        viewKeychain(key, price, salesTax, shippingCost, additionalShipingCost);
        System.out.println("Thanks for your otder, " + name + "!");
    }



}
