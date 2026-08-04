package basic_math;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPalindrome = palindromeCheck(n);
        System.out.println("Is Palindrome: "+isPalindrome);
        sc.close();
    }

    public static boolean palindromeCheck(int n) {
        int originalNumber = n;
        int reversedNumber = 0;
        while (n > 0) {
            int digit = n%10;
            reversedNumber = reversedNumber*10 + digit;
            n = n/10;
        }
        return originalNumber == reversedNumber;
    }
}
