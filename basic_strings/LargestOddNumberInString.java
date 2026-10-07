package basic_strings;

import java.math.BigInteger;
import java.util.Scanner;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        String largestOddNumber = getLargestOddNumber(s);
        System.out.println("The largest odd number is: " + largestOddNumber);
        sc.close();
    }

    public static String getLargestOddNumber(String s) {
        BigInteger number = new BigInteger(s);
        while(number.compareTo(BigInteger.ZERO) > 0) {
            if (number.testBit(0)) {
                return String.valueOf(number);
            }
            number = number.divide(BigInteger.valueOf(10));
        }
        return "";
    }
}
