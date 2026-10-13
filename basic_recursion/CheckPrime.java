package basic_recursion;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean isPrime;
        if (n <= 1) {
            isPrime = false;
        } else if (n == 2) {
            isPrime = true;
        } else {
            isPrime = checkPrime(n, 2);
        }
        if (isPrime) {
            System.out.println("The given number is a prime number");
        } else {
            System.out.println("The given number is NOT a prime number");
        }
        sc.close();
    }

    public static boolean checkPrime(int n, int i) {
        if (n % i == 0) {
            return false;
        }
        if (i * i < n) {
            return checkPrime(n, ++i);
        }
        return true;
    }
}
