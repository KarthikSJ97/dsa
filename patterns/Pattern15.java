package patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern15(n);
        sc.close();
    }

    public static void pattern15(int n) {
        for(int i=n; i>=1; i--) {
            int asciiValue = 'A';
            for(int j=i; j>= 1; j--) {
                System.out.print((char) asciiValue);
                asciiValue++;
            }
            System.out.println();
        }
    }
}
