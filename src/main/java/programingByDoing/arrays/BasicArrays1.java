package programingByDoing.arrays;

public class BasicArrays1 {
    public static void main(String[] args) {

        int[] arrays = new int[10];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = -113;

            System.out.println("Slot " + i + " contains a " + arrays[i]);
        }

    }
}
