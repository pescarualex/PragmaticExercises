package programingByDoing.records;

import java.util.Scanner;

class Student {
    String name;
    int grade;
    double average;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", average=" + average +
                '}';
    }
}

public class BasicRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();
        System.out.print("Enter the first student's name: ");
        student1.name = sc.next();
        System.out.println();
        System.out.print("Enter the first student's grade: ");
        student1.grade = sc.nextInt();
        System.out.println();
        System.out.print("Enter the first student's average: ");
        student1.average = sc.nextDouble();
        System.out.println();

        Student student2 = new Student();
        System.out.print("Enter the second student's name: ");
        student2.name = sc.next();
        System.out.println();
        System.out.print("Enter the second student's grade: ");
        student2.grade = sc.nextInt();
        System.out.println();
        System.out.print("Enter the second student's average: ");
        student2.average = sc.nextDouble();
        System.out.println();

        Student student3 = new Student();
        System.out.print("Enter the third student's name: ");
        student3.name = sc.next();
        System.out.println();
        System.out.print("Enter the third student's grade: ");
        student3.grade = sc.nextInt();
        System.out.println();
        System.out.print("Enter the third student's average: ");
        student3.average = sc.nextDouble();
        System.out.println();

        System.out.println("The names are: " + student1.name + ", " + student2.name + ", " + student3.name + "\n" +
                "The grades are: " + student1.grade + ", " + student2.grade + ", " + student3.grade + "\n" +
                "The averages are: " + student1.average + ", " + student2.average + ", " + student3.average);

        double sumAverages = (student1.average + student2.average + student3.average) / 3;

        System.out.println("The average for the three students is: " + sumAverages);



    }
}
