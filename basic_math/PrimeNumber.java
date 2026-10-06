package basic_math;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = checkIfPrime(num);
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is NOT a prime number");
        }
        sc.close();
    }

    public static boolean checkIfPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
