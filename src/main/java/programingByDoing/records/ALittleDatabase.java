package programingByDoing.records;

import java.util.Scanner;

class Student1 {
    String name;
    int grade;
    double average;

}
public class ALittleDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student1[] students = new Student1[3];

        students[0] = new Student1();
        System.out.println("Enter student 1's name:");
        students[0].name = sc.next();
        System.out.println("Enter studenet 1's grade:");
        students[0].grade = sc.nextInt();
        System.out.println("Enter studenet 1's average:");
        students[0].average = sc.nextDouble();

        students[1] = new Student1();
        System.out.println("Enter student 2's name:");
        students[1].name = sc.next();
        System.out.println("Enter studenet 2's grade:");
        students[1].grade = sc.nextInt();
        System.out.println("Enter studenet 2's average:");
        students[1].average = sc.nextDouble();

        students[2] = new Student1();
        System.out.println("Enter student 3's name:");
        students[2].name = sc.next();
        System.out.println("Enter studenet 3's grade:");
        students[2].grade = sc.nextInt();
        System.out.println("Enter studenet 3's average:");
        students[2].average = sc.nextDouble();

        System.out.print("The names are: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].name + " ");
        }
        System.out.println();

        System.out.print("The grades are: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].grade + " ");
        }
        System.out.println();

        System.out.print("The averages are: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].average + " ");
        }

//        System.out.println("The names are: " + students[0].name + ", " + students[1].name + ", " + students[2].name);
//        System.out.println("The grades are: " + students[0].grade + ", " + students[1].grade + ", " + students[2].grade);
//        System.out.println("The averages are: " + students[0].average + ", " + students[1].average + ", " + students[2].average);
    }
}
