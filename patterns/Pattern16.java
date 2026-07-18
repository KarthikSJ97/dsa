package patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern16(n);
        sc.close();
    }

    public static void pattern16(int n) {
        int asciiValue = 'A';
        for(int i = 1; i<=n; i++){
            for (int j=1; j<=i; j++) {
                System.out.print((char) asciiValue);
            }
            asciiValue++;
            System.out.println();
        }
    }
}
