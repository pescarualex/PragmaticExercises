package programingByDoing.sorting;

import java.util.Random;

public class SelectionSort {

    static int minIndex;

    public static void selection_sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
                swap(a, i);
            }
        }
    }

    public static void swap(int[] a, int i) {
        int tmp = a[i];
        a[i] = a[minIndex];
        a[minIndex] = tmp;
    }


    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int i;

        // Fill up the array with random numbers
        for (i = 0; i < arr.length; i++)
            arr[i] = 1 + r.nextInt(100);

        // Display it
        System.out.print("before: ");
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        // Sort it
        selection_sort(arr);

        // Display it again to confirm that it's sorted
        System.out.print("after : ");
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
