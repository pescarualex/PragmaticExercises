package dataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComputingStatistics {

    Scanner sc = new Scanner(System.in);
    List<String> numbers = new ArrayList<>();
    List<Integer> numbersAsInt = new ArrayList<>();
    private int average;
    private int total = 0;
    private double standardDeviation;
    private double sqNum;
    private double sqNumAdd;
    private double sqNumTot;

    private void getTheNumber() {

        boolean x = false;

        while (!x) {
            System.out.println("Enter a number: ");
            String num = sc.next();

            numbers.add(num);

            if (numbers.contains("done")) {
                numbers.remove("done");
                x = true;
            }
        }

        System.out.print("Numbers: ");
        for (String num : numbers) {
            numbersAsInt.add(Integer.parseInt(num));
            System.out.print(num + ", ");
            System.out.println();
        }

        for (int num : numbersAsInt) {
            total += num;
            average = total / numbersAsInt.size();
        }

        System.out.println("The average is " + average + ".");

        Collections.sort(numbersAsInt);

        System.out.println("The minimum is " + numbersAsInt.get(0));
        System.out.println("The maximum is " + numbersAsInt.get(numbersAsInt.size() - 1));

        for (int num : numbersAsInt) {
            sqNum = Math.pow(num - average, 2);
            sqNumAdd += sqNum;
            sqNumTot = sqNumAdd / numbersAsInt.size();
            standardDeviation = Math.sqrt(sqNumTot);
        }

        System.out.println("The standard deviation is " + standardDeviation);

    }

    public static void main(String[] args) {
        ComputingStatistics comp = new ComputingStatistics();
        comp.getTheNumber();
    }


}
