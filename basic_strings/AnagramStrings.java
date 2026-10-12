package basic_strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = sc.next();
        String s2 = sc.next();
        boolean isAnagram = checkIfAnagram(s1, s2);
        if(isAnagram) {
            System.out.println("The given strings form an anagram");
        } else {
            System.out.println("The given strings DO NOT form an anagram");
        }
        sc.close();
    }

    public static boolean checkIfAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        if(s1.equals(s2)) {
            return true;
        }
        
        int strLength = s1.length();
        // Prepare char frequency map for s1
        Map<Character, Integer> s1CharMap = new HashMap<>();
        for(int i=0; i<strLength; i++) {
            char ch = s1.charAt(i);
            int chFreq = s1CharMap.getOrDefault(ch, 0);
            chFreq++;
            s1CharMap.put(ch, chFreq);
        }

        // Prepare char frequency map for s2
        Map<Character, Integer> s2CharMap = new HashMap<>();
        for(int i=0; i<strLength; i++) {
            char ch = s2.charAt(i);
            int chFreq = s2CharMap.getOrDefault(ch, 0);
            chFreq++;
            s2CharMap.put(ch, chFreq);
        }

        // validate frequency of each character in both strings
        for(char ch: s1CharMap.keySet()) {
            int s1ChFreq = s1CharMap.getOrDefault(ch, 0);
            int s2ChFreq = s2CharMap.getOrDefault(ch, 0);
            if(s1ChFreq != s2ChFreq) {
                return false;
            }
        }

        return true;
    }
}
