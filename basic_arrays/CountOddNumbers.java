package basic_arrays;

import java.util.Scanner;

public class CountOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = Math.abs(sc.nextInt());

        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int oddElementsCount = getOddNumbersCount(arr, size);
        System.out.println("The number of odd elements in given arr is " + oddElementsCount);
        sc.close();
    }

    public static int getOddNumbersCount(int[] arr, int size) {
        int oddElementsCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                oddElementsCount ++;
            }
        }
        return oddElementsCount;
    }

}
