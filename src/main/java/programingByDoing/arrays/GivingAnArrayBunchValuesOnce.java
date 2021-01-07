package programingByDoing.arrays;

public class GivingAnArrayBunchValuesOnce {
    public static void main(String[] args) {

        String[] names = {"alpha", " bravo", "charlie", "delta", "echo"};
        int[] integers = {1, 2, 3, 4, 5};

        System.out.println("The first array is filled up with the following values:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("\t" + names[i] + " ");
        }

        System.out.println("\nThe second array is filled with the following values: ");
        for (int i = 0; i < integers.length; i++) {
            System.out.print("\t" + integers[i] + " ");
        }

    }
}
