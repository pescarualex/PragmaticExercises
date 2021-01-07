package programingByDoing.fileInputAndOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LetterRevisited {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/programingByDoing/fileInputAndOutput/letter_revisited.txt"));

        String letter = "+---------------------------------------------------------+\n" +
                "|                                                    #### |\n" +
                "|                                                    #### |\n" +
                "|                                                    #### |\n" +
                "|                                                         |\n" +
                "|                                                         |\n" +
                "|                              Bill Gates                 |\n" +
                "|                              1 Microsoft Way            |\n" +
                "|                              Redmond, WA 98104          |\n" +
                "|                                                         |\n" +
                "+---------------------------------------------------------+";

        bufferedWriter.write(letter);
        bufferedWriter.close();
    }
}
