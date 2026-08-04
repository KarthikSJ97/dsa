package basic_math;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversedNumber = reverseNumber(n);
        System.out.println(reversedNumber);
        sc.close();
    }

    public static int reverseNumber(int n) {
        int reversedNumber = 0;
        while (n > 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n = n / 10;
        }
        return reversedNumber;
    }
}
