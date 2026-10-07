package basic_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondHighestElement {
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
        int secondMostFrequentElement = getSecondMostFrequentElement(size, arr);
        System.out.println("The second most frequent element in the given array is " + secondMostFrequentElement);
        sc.close();
    }

    public static int getSecondMostFrequentElement(int size, int[] arr) {
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

        // keep track of highest and second highest element with it's frequency
        boolean hasHighest = false;
        int highestValue = 0;
        int mostFrequentElement = 0;
        boolean hasSecondHighest = false;
        int secondHighestValue = 0;
        int secondMostFrequentElement = 0;

        // Iterate through each entry and get the second highest frequency element
        for (Map.Entry<Integer, Integer> element : frequencyMap.entrySet()) {
            int key = element.getKey();
            int value = element.getValue();

            if (!hasHighest) {
                highestValue = value;
                mostFrequentElement = key;
                hasHighest = true;
            } else if (value > highestValue) {
                secondHighestValue = highestValue;
                secondMostFrequentElement = mostFrequentElement;
                hasSecondHighest = true;

                highestValue = value;
                mostFrequentElement = key;
            } else if (value == highestValue) {
                if (key < mostFrequentElement) {
                    highestValue = value;
                    mostFrequentElement = key;
                }
            } else if (!hasSecondHighest
                    || value > secondHighestValue
                    || (value == secondHighestValue && key < secondMostFrequentElement)) {
                secondHighestValue = value;
                secondMostFrequentElement = key;
                hasSecondHighest = true;
            }
        }

        if (!hasSecondHighest) {
            return -1;
        }
        return secondMostFrequentElement;
    }
}
