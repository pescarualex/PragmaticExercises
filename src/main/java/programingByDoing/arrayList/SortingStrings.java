package programingByDoing.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingStrings {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("ask");
        words.add("not");
        words.add("what");
        words.add("your");
        words.add("country");
        words.add("can");
        words.add("do");
        words.add("for");
        words.add("you");
        words.add("but");

        System.out.println("ArrayList: " + words);

        sort(words);

        System.out.println("ArrayList sorted: " + words);

    }

    public static void sort(ArrayList<String> words) {
        Collections.sort(words);
    }
}
