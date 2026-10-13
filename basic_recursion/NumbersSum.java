package basic_recursion;

import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = numbersSum(n);
        System.out.println("The sum of the given numbers is: " + sum);
        sc.close();
    }

    public static int numbersSum(int n) {
        if(n==0) {
            return 0;
        }
        return n + numbersSum(n-1);
    }
}
