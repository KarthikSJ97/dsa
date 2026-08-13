package basic_math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int[] divisors = getAllDivisors(n);
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
    }

    public static int[] getAllDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for(int i=1; i*i <=n; i++) {
            if(n%i == 0) {
                divisors.add(i);
                if(n/i!=i) {
                    divisors.add(n/i);
                }
            }
        }
        return divisors.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
