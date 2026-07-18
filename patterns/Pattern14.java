package patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern14(n);
        sc.close();
    }

    public static void pattern14(int n) {
        for(int i=1; i<=n ; i++) {
            int asciiValue = 'A';
            for (int j=1; j<=i; j++) {
                System.out.print((char)asciiValue);
                asciiValue++;
            }
            System.out.println();
        }
    }
}
