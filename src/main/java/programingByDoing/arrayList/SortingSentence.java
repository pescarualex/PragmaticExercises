package programingByDoing.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingSentence {
    public static void main(String[] args) {
        String sentence = "How I want a drink alcoholic of course after the heavy lectures involving Quantum Mecanics";

        String[] words = sentence.toLowerCase().split(" ");

        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));

        System.out.println("Sectence: " + sentence);

        Collections.sort(wordsList);

        System.out.println("Sentence corted: " + wordsList);
    }
}
