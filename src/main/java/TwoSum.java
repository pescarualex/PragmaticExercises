import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) throws ParseException {
        KangarooJumps.kangaroo(0, 2, 5, 3);

    }
}


class KangarooJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        for(int i = x1; i < 13; i += v1){
            for(int j = x2; j < 13; j += v2){
                if(i == j){
                    return "YES";
                } else {
                    return "NO";
                }
            }
        }
        return "";
    }
}

class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangeCount = 0;
        int[] newApples = new int[apples.length];

        for (int i = 0; i < apples.length; i++) {
            int total = apples[i] + a;
            newApples[i] = total;

            if (newApples[i] >= s && newApples[i] <= t) {
                appleCount++;
            }
        }

        int[] newOrange = new int[oranges.length];

        for (int j = 0; j < oranges.length; j++) {
            int total = oranges[j] + b;
            newOrange[j] = total;

            if (newOrange[j] >= s && newOrange[j] <= t) {
                orangeCount++;
            }
        }

        System.out.print(appleCount + "\n" + orangeCount);

    }
}

class GradingStudent {
    public List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> roundedGrades = new ArrayList<>();
        double grade = 0;

        for (int i = 0; i < grades.size(); i++) {

            if (Math.abs(grades.get(i) - (Math.ceil(grades.get(i) / 5f) * 5)) < 3 && grades.get(i) >= 38) {
                grade = Math.ceil(grades.get(i) / 5f) * 5;
                roundedGrades.add((int) grade);
            } else if (Math.abs(grades.get(i) - (Math.ceil(grades.get(i) / 5f) * 5)) >= 3 && grades.get(i) >= 38) {
                grade = grades.get(i);
                roundedGrades.add((int) grade);
            } else if (grades.get(i) < 38) {
                roundedGrades.add(grades.get(i));
            }
        }

        System.out.println(roundedGrades);
        return roundedGrades;
    }
}

class CountTheLargestNumberInArray {
    public void setArr(int[] array) {
        int[] arr = new int[10];

        arr[0] = 44;
        arr[1] = 53;
        arr[2] = 31;
        arr[3] = 27;
        arr[4] = 77;
        arr[5] = 60;
        arr[6] = 66;
        arr[7] = 77;
        arr[8] = 26;
        arr[9] = 36;

        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (max == arr[j]) {
                count++;
            }
        }
    }

}

class FormatDate {
    public String formatTimeDate(String s) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

        Date date = null;

        String output = null;

        date = df.parse(s);
        output = outputFormat.format(date);

        System.out.println(output);

        return "";
    }
}

class MinMaxSum {
    public void minMax(int[] arr) {
        long max = arr[0], min = arr[0], sum = 0;

        for (int j : arr) {
            sum += j;

            if (j > min) {
                min = j;
            }
            if (j < max) {
                max = j;
            }
        }

        System.out.print((sum - min) + " " + (sum - max));
    }
}

class Solution {
    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int aWin = 0;
        int bWin = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                bWin++;
            } else if (a.get(i) > b.get(i)) {
                aWin++;
            }
            result.add(aWin);
            result.add(bWin);
        }

        return result;


    }
}

