package basic_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        int mostFrequentElement = getMostFrequentElement(size, arr);
        System.out.println("The most frequent element in the given array is " + mostFrequentElement);
        sc.close();
    }

    public static int getMostFrequentElement(int size, int[] arr) {
        if (size == 0) {
            return -1;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int highestValue = 1;
        int mostFrequentElement = arr[0];
        for (int i = 0; i < size; i++) {
            int key = arr[i];
            int value = frequencyMap.getOrDefault(key, 0) + 1;
            frequencyMap.put(key, value);

            if (value > highestValue || (value == highestValue && key < mostFrequentElement)) {
                highestValue = value;
                mostFrequentElement = key;
            }
        }
        return mostFrequentElement;
    }
}
