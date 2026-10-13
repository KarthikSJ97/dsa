package basic_recursion;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSorted;
        if (arr.length == 1) {
            isSorted = true;
        } else {
            isSorted = checkIfSorted(arr, 0, 1);
        }

        if (isSorted) {
            System.out.println("The given array is sorted");
        } else {
            System.out.println("The given array is NOT sorted");
        }
        sc.close();
    }

    public static boolean checkIfSorted(int[] arr, int left, int right) {

        if (right >= arr.length) {
            return true;
        }
        if (arr[left] > arr[right]) {
            return false;
        }
        return checkIfSorted(arr, ++left, ++right);
    }
}
