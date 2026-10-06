package basic_arrays;

import java.util.Scanner;

public class SortedArrayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = Math.abs(sc.nextInt());

        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = checkIfSorted(arr, size);
        if (isSorted) {
            System.out.println("The given arr is sorted");
        } else {
            System.out.println("The given arr is NOT sorted");
        }

        sc.close();
    }

    public static boolean checkIfSorted(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
