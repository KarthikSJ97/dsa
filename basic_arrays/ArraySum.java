package basic_arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = Math.abs(sc.nextInt());

        int [] arr = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = getArraySum(arr, size);
        System.out.println("The sum of arr elements is " + sum);
        sc.close();
    }

    public static int getArraySum(int [] arr, int size) {
        int sum = 0;
        for(int i=0; i<size; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
