package cs50;

import java.util.Scanner;

public class BubbleSort {
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

        // Bubble sort algorithm
        int[] sortedArray = bubbleSort(n, arr);
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }

    // Iterate through the array
    // For each element, compare it with the element in the next index
    // If current element is larger, bubble it out by swapping those 2 elements
    public static int[] bubbleSort(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            boolean elementsSwapped = false;
            for(int j= i+1; j<n; j++) {
                if (arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                    elementsSwapped = true;
                }
            }
            // If no swaps done in this pass, the array is completely sorted
            // And we can safely stop the process
            if (!elementsSwapped) {
                return arr;
            }
        }
        return arr;
    }
}
