package basic_recursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] reversedArr = getReversed(arr, 0, size - 1);
        System.out.println("The reversed array is given below:");
        for (int i = 0; i < size; i++) {
            System.out.print(reversedArr[i] + " ");
        }
        System.out.println();
        sc.close();
    }

    public static int[] getReversed(int[] arr, int left, int right) {
        if (arr.length == 1) {
            return arr;
        }
        if (left >= right) {
            return arr;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return getReversed(arr, ++left, --right);
    }
}
