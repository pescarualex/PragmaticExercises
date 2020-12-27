package pragmaticExercises.dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListRemoval {

    private static void removeEmployee() {

        Scanner sc = new Scanner(System.in);

        List<String> listOfEmployees = new ArrayList<>();
        List<String> removeOneEmployee = new ArrayList<>();

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
                removeOneEmployee.add(employee);
            }
        }

        listOfEmployees.removeAll(removeOneEmployee);

        for (String employee : listOfEmployees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        removeEmployee();
    }
}
