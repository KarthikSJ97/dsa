package basic_strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();
        char[] frequencySortedArray = frequencySort(s);
        System.out.println("resultant array: ");
        for (char ch : frequencySortedArray) {
            System.out.print(ch + " ");
        }
        System.out.println();
        sc.close();
    }

    public static char[] frequencySort(String s) {
        // prepare frequency map
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            int freq = freqMap.getOrDefault(ch, 0) + 1;
            freqMap.put(ch, freq);
        }

        // prepare list of characters
        List<Character> chList = new ArrayList<>(freqMap.keySet());
        // sort them based on their frequency and alphabetical order
        chList.sort((a, b) -> {
            int freqCompare = freqMap.get(b).compareTo(freqMap.get(a));
            // Sorts alphabetically (ascending) if frequencies are equal
            if (freqCompare == 0) {
                return a.compareTo(b);
            }
            return freqCompare;
        });

        char[] frequencySortedArray = new char[chList.size()];
        for (int i = 0; i < chList.size(); i++) {
            frequencySortedArray[i] = chList.get(i);
        }

        return frequencySortedArray;
    }
}
