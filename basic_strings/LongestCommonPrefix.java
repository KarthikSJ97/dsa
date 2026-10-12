package basic_strings;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter an array of strings: ");
        String[] strings = new String[size];
        for(int i=0; i<size; i++) {
            strings[i] = sc.next();
        }
        String lcp = longestCommonPrefix(size, strings);
        System.out.println("The longest common prefix for the given string is: " + lcp);
        sc.close();
    }

    public static String longestCommonPrefix(int size, String[] strings) {
        int maxIndex = Integer.MAX_VALUE;
        for(int i=0; i<size; i++) {
            String s = strings[i];
            int strLength = s.length();
            if(strLength < maxIndex) {
                maxIndex = strLength - 1;
            }
        }
        for(int i=0; i<maxIndex; i++) {
            String lcp = "";
            boolean lcpFound = true;
            for(int j=0; j<size; j++) {
                String currentLcp = strings[j].substring(0, maxIndex);
                if(lcp == "") {
                    lcp = currentLcp;
                }
                if(!lcp.equals(currentLcp)) {
                    lcpFound = false;
                    continue;
                }
            }
            if (lcpFound) {
                return lcp;
            }
            maxIndex--;
        }
        return "";
    }
}
