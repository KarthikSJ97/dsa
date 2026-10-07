package basic_strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        boolean isPalindrome = checkIfPalindrome(s);
        if (isPalindrome) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is NOT a palindrome");
        }
        sc.close();
    }

    public static boolean checkIfPalindrome(String s) {
        char[] charArray = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
            charArray[i] = s.charAt(s.length() - i - 1);
        }
        String reversedString = new String(charArray);
        return s.equals(reversedString);
    }
}
