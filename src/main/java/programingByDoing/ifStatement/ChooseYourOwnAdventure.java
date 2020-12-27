package programingByDoing.ifStatement;

import java.util.Scanner;

public class ChooseYourOwnAdventure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("You are in a creepy house.\n" +
                "Would you like to go \" upstairs\" or into yhe \"kitchen\"?");
        String firstFloor = sc.next();

        if (firstFloor.equalsIgnoreCase("kitchen")) {
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\".");
            String obj = sc.next();
            if (obj.equalsIgnoreCase("refrigerator")) {
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")");
                String ans = sc.next();
                if (ans.equalsIgnoreCase("no")) {
                    System.out.println("You die of starvation... eventually.");
                }
            }
        } else if (firstFloor.equalsIgnoreCase("upstairs")) {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?");
        }

    }








}
