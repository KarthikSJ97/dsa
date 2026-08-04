package patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern19(n);
        scanner.close();
    }

    public static void pattern19(int n) {
        for(int i = 1; i <= n/2; i++) {
            for(int j=n/2; j >= i; j--) {
                System.out.print("*");
            }
            for(int j=1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j=n/2; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n/2; i >= 1; i--) {
            for(int j=i; j <= n/2; j++) {
                System.out.print("*");
            }
            for(int j=i; j > 1; j--) {
                System.out.print(" ");
            }
            for(int j=i; j > 1; j--) {
                System.out.print(" ");
            }
            for(int j=i; j <= n/2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
