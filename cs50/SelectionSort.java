package cs50;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter an array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // Selection sort algorithm
        int[] sortedArr = selectionSort(n, arr);
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
    }

    // Iterate through the array
    // In every pass, consider the current element as the smallest
    // Iterate through the remaining elements and replace position with the new smaller element if it exists
    public static int[] selectionSort(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int smallestElement = arr[i];
                if (arr[j] < smallestElement) {
                    int newSmallestElement = arr[j];
                    arr[i] = newSmallestElement;
                    arr[j] = smallestElement;
                }
            }
        }
        return arr;
    }
}
