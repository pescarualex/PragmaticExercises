package programingByDoing.whileLoop;

import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 3, b = 3, c = 3;
        String pile;
        int removePile;
        int total;

        do {
            System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
            System.out.print("Choose a pile: ");
            pile = sc.next();
            if (pile.equalsIgnoreCase("a")) {
                System.out.println("How many to remove from pile A: ");
                removePile = sc.nextInt();
                a -= removePile;
            } else if (pile.equalsIgnoreCase("b")) {
                System.out.println("How many to remove from pile B: ");
                removePile = sc.nextInt();
                b -= removePile;
            } else if (pile.equalsIgnoreCase("c")) {
                System.out.println("How many to remove from pile C: ");
                removePile = sc.nextInt();
                c -= removePile;
            }

            total = a + b + c;

        } while (total > 0);

        System.out.println("A: " + a + "\tB: " + b + "\tC: " + c);
        System.out.println("All piles are empty. Good job!");


    }





}
