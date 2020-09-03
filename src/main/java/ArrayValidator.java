import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArrayValidator {

    // BST - preorder traversals
    public static String validationArray(int[] array) {
        for (int k = 0; k < array.length; k++) {
            for (int x = k + 1; x < array.length; x++) {
                if (array[k] < array[x]) {
                    for (int y = x + 1; y < array.length; y++) {
                        if (array[y] < array[k]) {
                            return "INVALID";
                        }
                    }
                }
            }
        }
        return "VALID";
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("src/main/java/input_ex6.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("target/arrayValidatorOutput.txt"));

        //value of T
        int testCasesCount = scanner.nextInt();

        for (int i = 1; i <= testCasesCount; i++) {
            //value of N
            int arrayLenght = scanner.nextInt();

            // array A
            int[] array = new int[arrayLenght];

            for (int j = 0; j < arrayLenght; j++) {
                array[j] = scanner.nextInt();
            }

            String result = validationArray(array);

            String outputLine = "CASE #" + i + ": " + result;

            bufferedWriter.write(outputLine);
            bufferedWriter.newLine();
        }

        scanner.close();
        bufferedWriter.close();

    }


}
