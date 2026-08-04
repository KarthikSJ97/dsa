package basic_math;

import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = countDigits(n);
        System.out.println(count);
        sc.close();
    }

    public static int countDigits(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n = n/10;
        }
        return count;
    }
}
