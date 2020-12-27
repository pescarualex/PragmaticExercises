package programingByDoing.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Calculator {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String a;
    static boolean stop = true;

    public static void main(String[] args) throws IOException {

        while (stop) {
            System.out.print(">");
            a = br.readLine();
            String[] str = a. trim().split("\\s+[+]\\s+");
            String[] split = a.trim().split("^[0-9][\\s+][\\s+][0-9]*$");

            List<Integer> nums = new ArrayList<>();

            for (int i = 0; i < str.length; i++) {
                nums.add(Integer.parseInt(str[i]));
                for (int j = 0; j < split.length; j++) {
                    if (split[j].equalsIgnoreCase("+")) {
                        addition(nums.get(i));
                    }
                }
            }


        }
    }


    public static void addition(int nums) {

        if (nums == 0) {
            System.out.println("Goodbay!");
            stop = false;
        }

        nums += nums;
        System.out.println(nums);
    }



    public static int substraction(int a, int b) {
        System.out.print("> ");

        if (a == 0 || b == 0) {
            System.out.println("Goodbay!");
            stop = false;
        }

        int total = a - b;
        System.out.println(total);
        return total;
    }

    public static int multiplication(int a, int b) {
        System.out.print("> ");

        if (a == 0 || b == 0) {
            System.out.println("Goodbay!");
            stop = false;
        }

        int total = a * b;
        System.out.println(total);
        return total;
    }

    public static double division(double a, double b) {
        System.out.print("> ");

        if (a == 0 || b == 0) {
            System.out.println("Goodbay!");
            stop = false;
        }

        double total = a / b;
        System.out.println(total);
        return total;
    }
}
