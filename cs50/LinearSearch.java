package cs50;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        System.out.print("Input array: ");
        int[] arr = new int[n];
        for(int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int searchElement = sc.nextInt();
        System.out.println();

        sc.close();

        // search for requested element
        boolean found = linearSearch(n, arr, searchElement);
        if (found) {
            System.out.println("Found the element");
            return;
        }
        System.out.println("Element not found in the array");
        return;

    }

    public static boolean linearSearch(int n, int[] arr, int searchElement) {
        for(int i = 0; i<n; i++) {
            if(searchElement == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
