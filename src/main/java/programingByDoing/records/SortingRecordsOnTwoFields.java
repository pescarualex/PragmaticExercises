package programingByDoing.records;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class StudentGrade {
    int studentId;
    int gradeNumber;
    int grade;
    String letterGrade;
}

public class SortingRecordsOnTwoFields {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/programingByDoing/records/gb.txt");
        Scanner scanner = new Scanner(file);

        StudentGrade temp;
        StudentGrade tmp;

        StudentGrade[] studentGrades = new StudentGrade[30];

        int count = 0;
        while (scanner.hasNext()) {
            studentGrades[count] = new StudentGrade();
            studentGrades[count].studentId = scanner.nextInt();
            studentGrades[count].gradeNumber = scanner.nextInt();
            studentGrades[count].grade = scanner.nextInt();
            studentGrades[count].letterGrade = scanner.next();
            count++;
        }

        for (int i = 0; i < studentGrades.length; i++) {
            for (int j = 0; j < studentGrades.length; j++) {
                if (studentGrades[i].studentId < studentGrades[j].studentId) {
                    temp = studentGrades[i];
                    studentGrades[i] = studentGrades[j];
                    studentGrades[j] = temp;
                }
            }
        }

        for (int j = 0; j < studentGrades.length; j++) {
            for (int i = 0; i < studentGrades.length; i++) {
                if (studentGrades[j].studentId == studentGrades[i].studentId &&
                        studentGrades[j].gradeNumber < studentGrades[i].gradeNumber) {
                    tmp = studentGrades[j];
                    studentGrades[j] = studentGrades[i];
                    studentGrades[i] = tmp;
                }
            }
        }

        for (int i = 0; i < studentGrades.length; i++) {
            System.out.println
                    (studentGrades[i].studentId + " " + studentGrades[i].gradeNumber
                            + " " + studentGrades[i].grade + " " + studentGrades[i].letterGrade);

        }
    }
}
