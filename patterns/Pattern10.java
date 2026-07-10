package patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern10(n);
        sc.close();
    }

    public static void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < 2 * n - i; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
