package patterns;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern20(n);
        sc.close();
    }

    public static void pattern20(int n) {
        for(int i = 1; i<= n/2; i++) {
            for (int j= 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j= n/2; j > i; j--) {
                System.out.print(" ");
            }

            for (int j= n/2; j > i; j--) {
                System.out.print(" ");
            }

            for (int j= 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n/2; i >= 1; i--) {
            for (int j= i; j > 1; j--) {
                System.out.print("*");
            }

            for (int j= i-1; j < n/2; j++) {
                System.out.print(" ");
            }

            for (int j= i-1; j < n/2; j++) {
                System.out.print(" ");
            }

            for (int j= i; j > 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
