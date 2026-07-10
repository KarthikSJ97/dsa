package patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern9(n);
        sc.close();
    }

    public static void pattern9(int n) {
        topPyramid(n);
        bottomPyramid(n);
    }

    public static void topPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void bottomPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * n - 2 * i + 1; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
