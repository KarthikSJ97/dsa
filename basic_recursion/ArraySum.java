package basic_recursion;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        int index = size - 1;
        int sum = getSum(index, arr);
        System.out.println("The sum of given elements is: " + sum);
        sc.close();
    }

    public static int getSum(int index, int[] arr) {
        if(index < 0) {
            return 0;
        }
        return arr[index] + getSum(--index, arr);
    }
}
