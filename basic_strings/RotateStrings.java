package basic_strings;

import java.util.Scanner;

public class RotateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = sc.next();
        String s2 = sc.next();
        boolean rotatedStrings = checkIfRotated(s1, s2);
        if(rotatedStrings) {
            System.out.println("The given strings can be achieved by rotating");
        } else {
            System.out.println("The given strings CANNOT be achieved by rotating");
        }
        boolean rotatedStrings2 = checkIfRotatedConcateMethod(s1, s2);
        if(rotatedStrings2) {
            System.out.println("The given strings can be achieved by rotating");
        } else {
            System.out.println("The given strings CANNOT be achieved by rotating");
        }
        sc.close();
    }

    public static boolean checkIfRotated(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        if(s1.equals(s2)) {
            return true;
        }
        int strLength = s1.length();
        for(int i=0; i<strLength; i++) {
            // String Rotation logic
            char lastChar = s1.charAt(strLength - 1);
            s1 = lastChar + s1.substring(0, strLength - 1);
            if(s1.equals(s2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIfRotatedConcateMethod(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        if(s1.equals(s2)) {
            return true;
        }
        // The double string rotation trick
        String temp = s1+s1;
        if(temp.contains(s2)) {
            return true;
        } else {
            return false;
        }
    }
}
