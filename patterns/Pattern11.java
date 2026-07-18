package patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern11(n);
        sc.close();
    }

    public static void pattern11(int n) {
        int flag;
        for (int i = 1; i <= n; i++) {
            flag = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(flag);
                flag = Math.abs(flag - 1);
            }
            System.out.println();
        }
    }
}
