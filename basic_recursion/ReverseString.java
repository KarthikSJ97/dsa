package basic_recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        char[] charArr = s.toCharArray();
        String reverseString = getReversedString(charArr);
        System.out.println("The reversed string is: " + reverseString);
        sc.close();
    }

    public static String getReversedString(char [] charArr) {
        int arrLength = charArr.length;
        if(arrLength <= 0) {
            return "";
        } else if(arrLength == 1) {
            return String.valueOf(charArr[0]);
        }
        return charArr[arrLength - 1] + getReversedString(new String(charArr, 0, --arrLength).toCharArray());
    }
}
