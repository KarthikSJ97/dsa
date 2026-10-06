package basic_math;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ld = largestDigit(num);
        System.out.println("Largest digit in the number " + num + " is " + ld);
        sc.close();
    }

    public static int largestDigit(int num) {
        int ld = 0;
        while(num > 0) {
            int rem = num % 10;
            if (rem > ld) {
                ld = rem;
            }
            num = num / 10;
        }
        return ld;
    }
}
