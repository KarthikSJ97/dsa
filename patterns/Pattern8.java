package patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern8(n);
        sc.close();
    }

    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2*n-2*i+1; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
