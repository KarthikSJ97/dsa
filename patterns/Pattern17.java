package patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern17(n);
        sc.close();
    }

    public static void pattern17(int n) {

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            // characters
            int asciiValue = 'A';
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char) asciiValue);
                if (j < i) {
                    asciiValue++;
                } else {
                    asciiValue--;
                }
            }

            // space
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
