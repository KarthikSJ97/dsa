package patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern5(n);
        sc.close();
    }

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
