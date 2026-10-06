package basic_math;

import java.util.Scanner;

public class PrimeNumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int primeNumbers = getAllPrimeNumbersCount(num);
        System.out.println("There are " + primeNumbers + " prime numbers until " + num + " (included)");
        sc.close();
    }

    public static int getAllPrimeNumbersCount(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (PrimeNumber.checkIfPrime(i)) {
                count++;
            }
        }
        return count;
    }
}
