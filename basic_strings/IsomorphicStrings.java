package basic_strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = sc.next();
        String s2 = sc.next();
        boolean isIsomorphicStrings = checkIfIsomorphic(s1, s2);
        if (isIsomorphicStrings) {
            System.out.println("The given strings are isomorphic");
        } else {
            System.out.println("The given strings are NOT isomorphic");
        }
        sc.close();
    }

    public static boolean checkIfIsomorphic(String s1, String s2) {
        Map<Character, Character> charMap = new HashMap<>();
        if (s1.length() != s2.length()) {
            return false;
        }
        int size = s1.length();
        for (int i = 0; i < size; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (charMap.containsKey(ch1)) {
                char mappedCh = charMap.getOrDefault(ch1, '0');
                if (ch2 != mappedCh) {
                    return false;
                }
            } else {
                charMap.put(ch1, ch2);
            }
        }
        return true;
    }
}
