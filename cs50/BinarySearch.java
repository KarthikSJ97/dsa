package cs50;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter a sorted array: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // Explicilty sorting the array in case if it is not in order
        Arrays.sort(arr);

        System.out.print("Enter the element to be searched: ");
        int searchElement = sc.nextInt();

        sc.close();

        // Binary search algorithm
        boolean found = binarySearch(n, arr, searchElement);
        if (found) {
            System.out.println("Fount the element!");
            return;
        }
        System.out.println("Element not found");
        return;
    }

    public static boolean binarySearch(int n, int[] arr, int searchElement) {
        int leftIndex = 0;
        int rightIndex = n-1;
        
        while(leftIndex <= rightIndex) {
            int mid = (leftIndex + rightIndex) / 2;
            if (arr[mid] == searchElement) {
                return true;
            } else if (searchElement > arr[mid]) {
                leftIndex = mid + 1;
            } else {
                rightIndex = mid - 1;
            }
        }
        return false;
    }
}
