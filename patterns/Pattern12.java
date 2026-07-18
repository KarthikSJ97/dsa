package patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern12(n);
        sc.close();
    }

    public static void pattern12(int n) {
        for(int i = 1; i<=n ; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j<= (n-i)*2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j>= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
