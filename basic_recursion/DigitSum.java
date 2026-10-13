package basic_recursion;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = getDigitSum(n);
        System.out.println("The sum of the digits of the given number until the result has one digit is: " + sum);
        sc.close();
    }

    public static int getDigitSum(int n) {
        if(n < 10) {
            return n;
        }
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        
        return getDigitSum(sum);
    }
}
