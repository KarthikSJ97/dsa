package basic_recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        boolean isPalindrome;
        if(s.isBlank() || s.length() == 1) {
            isPalindrome = true;
        } else {
            isPalindrome = checkIfPalindrome(s, 0, s.length() - 1);
        }
        
        if(isPalindrome) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is NOT a palindrome");
        }
        sc.close();
    }

    public static boolean checkIfPalindrome(String s, int left, int right) {
        if(left >= right) {
            return true;
        }
        if(s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return checkIfPalindrome(s, ++left, --right);
    }
}
