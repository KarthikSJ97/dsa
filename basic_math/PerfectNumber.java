package basic_math;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPerfect = checkifPerfect(num);
        if (isPerfect) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is NOT a perfect number");
        }
        sc.close();
    }

    public static boolean checkifPerfect(int num) {
        int sum = 0;

        for(int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                sum = sum + i;
                /* 
                    Since we only loop from 1 to Sqrt root of num
                    We might loose out on divisors larger than Sqrt root of num

                    For ex: if the number is 36, we only check for divisors between 1 and 6 (we will miss 9, 12, 18, 36)
                    Since num is divisible by i, it is guaranteed that num/i is also a divisor. 
                    We only add it if it is not i or num itself to avoid duplicate divisors in case of perfect squares
                */ 
                if(num/i != i && num/i != num) {
                    sum = sum + (num/i);
                }
            }
        }
        if (sum == num) {
            return true;
        }

        return false;
    }
}
