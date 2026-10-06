package basic_arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = Math.abs(sc.nextInt());

        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] reversedArray = reverseArray(arr, size);
        System.out.println("Here is the reversed array:");
        for(int i=0; i<size; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }

    public static int[] reverseArray(int[] arr, int size) {
        
        int leftIndex = 0;
        int rightIndex = size-1;
        while(leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        return arr;
    }
}
