package basic_math;

import java.util.Scanner;

public class CountOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oddDigits = countOddDigits(num);
        System.out.println("number of odd digits in a number: "+ oddDigits);
        sc.close();
    }

    public static int countOddDigits(int num) {
        int oddDigits = 0;
        while(num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                oddDigits++;
            }
            num = num / 10;
        }
        return oddDigits;
    }
}
