package basic_recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth element:");
        int n = sc.nextInt();
        int result;
        if (n < 0) {
            System.out.println("no series");
            sc.close();
            return;
        } else {
            result = getFibonacci(n, 0, 1);
        }
        System.out.println("The requested element of the Fibonacci series is: " + result);
        sc.close();
    }

    // 0 (0th element), 1 (1st), 1 (2nd), 2, 3, 5, 8, 13, 21......
    public static int getFibonacci(int n, int n1, int n2) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return n1 + n2;
        }
        int temp = n2;
        n2 = n1 + n2;
        n1 = temp;
        return getFibonacci(--n, n1, n2);
    }
}
