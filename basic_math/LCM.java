package basic_math;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        System.out.println();

        int lcm = getLCM(num1, num2);
        System.out.println("The least common multiple of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }

    public static int getLCM(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        if (num1 == num2) {
            return num1;
        }

        int lcm = 0;
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        
        if (max % min == 0) {
            return max;
        }
        lcm = max;
        while(lcm % min != 0) {
            lcm = lcm + max;
        }
        return lcm;
    }
}
