package programingByDoing.whileLoop;

import java.util.Scanner;

public class Adventure2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int room = 1;
        String choise;

        while (room != 0) {
            if (room == 1) {
                System.out.println("Esti in casa groazei.\n" +
                        "In hol, sunt doua usi, una duce in \"bucatarie\",\n" +
                        "una duce in \"living\".\n" +
                        "In care camera vrei sa mergi?");
                choise = sc.next();
                if (choise.equalsIgnoreCase("bucatarie")) {
                    room = 2;
                } else if (choise.equalsIgnoreCase("living")) {
                    room = 3;
                } else {
                    System.out.println("Deci nu vrei sa intri in casa.. ok.\n" +
                            "END GAME");
                    room = 0;
                }
            }

            if (room == 2) {
                System.out.println("Bucataria este un dezastru, toate sunt aruncate pe jos.\n" +
                        "In coltul din stanga este un frigider murdar,\n" +
                        "mucegait pe la colturi.\n" +
                        "Vrei sa il deschizi, sau nu?");
                choise = sc.next();
                if (choise.equalsIgnoreCase("da")) {
                    System.out.println("In frigider gasesti mancare, care ar putea fi buna\n" +
                            "sau ar putea fi stricata. Ce faci, mananci sau nu?");
                    choise = sc.next();
                    if (choise.equalsIgnoreCase("mananc")) {
                        System.out.println("Totusi are un miros ciudat, parca nu este asa de buna.\n" +
                                "Dar tu ai mancat-o, ti se aude stomacul cum se intoarce pe dos.\n" +
                                "Ai deja ameteli si iti vine sa lesini.\n" +
                                "Ti se intuneca inaintea ochilor.\n" +
                                "Mori incet..\n" +
                                "END GAME");
                        room = 0;
                    } else if (choise.equalsIgnoreCase("nu")) {
                        System.out.println("Foarte buna alegere! \n" +
                                "Dar altceva nu au ce face, decat sa te incorci in hol.\n" +
                                "Vrei sa faci asta?");
                        choise = sc.next();
                        if (choise.equalsIgnoreCase("da")) {
                            room = 1;
                        } else if (choise.equalsIgnoreCase("nu")) {
                            System.out.println("Altceva nu ai ce face.\n" +
                                    "END GAME");
                        }
                    }
                }
            }
        }



    }

}
