package programingByDoing.ifStatement;

public class CompareToChallange {

    public static void main(String[] args) {

        System.out.println("Comparing \"neurostiinta\" with \"dog\" produces.");
        String one = "neurostiinta";
        String two = "dog";
        int i = one.compareToIgnoreCase(two);
        System.out.println(i);
        System.out.println();

        System.out.println("Comparing \"qwerty\" with \"xyz\" produces.");
        String three = "qwerty";
        String four = "xyz";
        int j = three.compareToIgnoreCase(four);
        System.out.println(j);
        System.out.println();

        System.out.println("Comparing \"alambicat\" with \"scurtqwerty\" produces.");
        String five = "alambicat";
        String six = "scurtqwerty";
        int k = five.compareToIgnoreCase(six);
        System.out.println(k);
        System.out.println();

        System.out.println("Comparing \"neurostiinta\" with \"neurostiinta\" produces.");
        String seven = "neurostiinta";
        String eight = "neurostiinta";
        int l = seven.compareToIgnoreCase(eight);
        System.out.println(l);



    }
}
