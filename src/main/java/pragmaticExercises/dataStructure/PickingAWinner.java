package pragmaticExercises.dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PickingAWinner {

    private static void listOfName() {

        Scanner sc = new Scanner(System.in);
        List<String> listOfNames = new ArrayList<>();

        boolean x = false;

        while (!x) {
            System.out.println("Enter a name: ");
            String name = sc.nextLine();
            listOfNames.add(name);

            if (name.isEmpty()) {
                Random random = new Random();

                x = true;

                String getTheRandomValue = listOfNames.get(random.nextInt(listOfNames.size()));
                System.out.println("The winner is... " + getTheRandomValue);
            }
        }
    }

    public static void main(String[] args) {
        listOfName();
    }


}
