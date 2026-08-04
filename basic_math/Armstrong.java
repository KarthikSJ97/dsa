package basic_math;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int originalNumber = n;
        String numString = Integer.toString(n);
        int numOfDigits = numString.length();
        while(n >0) {
            int digit = n%10;
            sum += Math.pow(digit, numOfDigits);
            n /= 10;
        }
        return originalNumber == sum ? true: false;
    }
}
