package basic_strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        String reversedString = reverse(s);
        System.out.println("Here is the reversed string: " + reversedString);
        sc.close();
    }

    public static String reverse(String s) {
        char[] charArray = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
            charArray[i] = s.charAt(s.length() - i - 1);
        }
        return new String(charArray);
    }
}
