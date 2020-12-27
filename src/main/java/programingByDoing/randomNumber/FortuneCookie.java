package programingByDoing.randomNumber;

import java.util.Random;

public class FortuneCookie {

    public static void main(String[] args) {

        String[] fortunes = new String[5];

        fortunes[0] = "You will find happiness with new love";
        fortunes[1] = "Stick with your wife";
        fortunes[2] = "You must to have a little piece";
        fortunes[3] = "Play a game, relax";
        fortunes[4] = "Go to know on somebody";

        Random r = new Random();

        String fortune = fortunes[r.nextInt(fortunes.length)];

        System.out.println("Fortune cookie says: " + fortune);

        System.out.print(1 + r.nextInt(54) + " - ");
        System.out.print(1 + r.nextInt(54) + " - ");
        System.out.print(1 + r.nextInt(54) + " - ");
        System.out.print(1 + r.nextInt(54) + " - ");
        System.out.print(1 + r.nextInt(54) + " - ");
        System.out.println(1 + r.nextInt(54));



    }



}
