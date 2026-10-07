package basic_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumHighestAndLowesFrequency {
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
        int sum = getSumOfLowestAndHighestFrequency(size, arr);
        System.out.println("The sum of the lowest and highest frequent elements in the given array is " + sum);
        sc.close();
    }

    public static int getSumOfLowestAndHighestFrequency(int size, int[] arr) {
        if (size == 0) {
            return -1;
        }

        // Prepare the frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int key = arr[i];
            int value = frequencyMap.getOrDefault(key, 0) + 1;
            frequencyMap.put(key, value);
        }

        int lowestFrequency = Integer.MAX_VALUE;
        int highestFrequency = Integer.MIN_VALUE;
        for (int value : frequencyMap.values()) {
            if (value > highestFrequency) {
                highestFrequency = value;
            } else if (value < lowestFrequency) {
                lowestFrequency = value;
            }
        }

        if(lowestFrequency == Integer.MAX_VALUE) {
            lowestFrequency = 0;
        }
        if(highestFrequency == Integer.MIN_VALUE) {
            highestFrequency = 0;
        }

        return lowestFrequency + highestFrequency;
    }
}
