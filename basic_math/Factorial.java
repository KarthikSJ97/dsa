package basic_math;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = numFactorial(num);
        System.out.println("The factorial of " + num + " is " + res);

        int recursiveRes = numFactRecursive(num);
        System.out.println("The factorial of " + num + " using recursion is " + recursiveRes);

        sc.close();
    }

    public static int numFactorial(int num) {
        int res = 1;

        if (num < 1) {
            return 1;
        }
        while (num >= 1) {
            res = res * num;
            num -= 1;
        }

        return res;
    }

    public static int numFactRecursive(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * numFactRecursive(num - 1);
        }
    }
}
