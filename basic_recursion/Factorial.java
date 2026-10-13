package basic_recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int fact = getFact(n);
        System.out.println("The factorial of the given number is: " + fact);
        sc.close();
    }

    public static int getFact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * getFact(n-1);
    }
}
