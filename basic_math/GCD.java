package basic_math;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int gcd = gcd(a,b);
        System.out.println(gcd);
        sc.close();
    }

    public static int gcd(int a, int b) {
        if(a==0) {
            return b;
        }

        if(b==0) {
            return a;
        }

        if (a==b) {
            return a;
        }

        if(a > b) {
            if (a%b == 0) {
                return b;
            }
            return gcd(a-b, b);
        }

        if(b%a == 0) {
            return a;
        }
        return gcd(a, b-a);
    }
}
