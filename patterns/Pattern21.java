package patterns;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern21(n);
        sc.close();
    }

    public static void pattern21(int n) {
        for (int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if (j==1 || j==n || i==1 || i==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
