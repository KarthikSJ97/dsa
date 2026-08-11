package cs50;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Input array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // Merge sort algorithm
        mergeSort(arr, 0, n - 1);
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Divide the array into two equal halves
    // Sort the left half
    // Sort the right half
    // Merge the elements
    // Call this recursively unless there is only one element
    // Example input: [6, 3, 4, 1, 5, 2, 7, 0]
    public static void mergeSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }

        int midIndex = (leftIndex + rightIndex) / 2;

        mergeSort(arr, leftIndex, midIndex);
        mergeSort(arr, midIndex + 1, rightIndex);

        merge(arr, leftIndex, midIndex, rightIndex);
    }

    public static void merge(int[] arr, int leftIndex, int midIndex, int rightIndex) {
        int leftArrSize = midIndex - leftIndex + 1;
        int rightArrSize = rightIndex - midIndex;

        int[] leftArr = new int[leftArrSize];
        int[] rightArr = new int[rightArrSize];

        for (int i = 0; i < leftArrSize; i++) {
            leftArr[i] = arr[leftIndex + i];
        }

        for (int i = 0; i < rightArrSize; i++) {
            rightArr[i] = arr[midIndex + 1 + i];
        }

        int i = 0, j = 0, k = leftIndex;

        while (i < leftArrSize && j < rightArrSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < leftArrSize) {
            arr[k++] = leftArr[i++];
        }

        while (j < rightArrSize) {
            arr[k++] = rightArr[j++];
        }
    }
}
