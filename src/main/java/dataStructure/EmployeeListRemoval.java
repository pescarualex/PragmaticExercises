package dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListRemoval {

    private static void listRemoval() {

        Scanner sc = new Scanner(System.in);

        List<String> listOfEmployees = new ArrayList<>();
        List<String> removeList = new ArrayList<>();

        listOfEmployees.add("John Smith");
        listOfEmployees.add("Jackie Jackson");
        listOfEmployees.add("Chris Jones");
        listOfEmployees.add("Amanda Cullen");
        listOfEmployees.add("Jeremy Goodwin");

        System.out.println("There are " + listOfEmployees.size() + " employee");

        for (String employee : listOfEmployees) {
            System.out.println(employee);
        }

        System.out.println("Enter an employee name to remove:");
        String removeEmployee = sc.nextLine();

        for (String employee : listOfEmployees) {
            if (removeEmployee.equalsIgnoreCase(employee)) {
                removeList.add(employee);
            }
        }

        listOfEmployees.removeAll(removeList);

        for (String employee : listOfEmployees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        listRemoval();
    }
}
