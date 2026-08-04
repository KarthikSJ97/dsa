package patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern22(n);
        sc.close();
    }

    public static void pattern22(int n) {
        // when n=4, i and j take values from index 1 to 7 i.e,. 1 to 2*n-1
        // subtract n from all elements and build the new matrix
        // identify the path for each element from top, bottom, left and right
        // identify the min of them all
        // Subtract it from n to get the actual element
        for(int i=1; i<= 2*n-1; i++) {
            for(int j=1; j<= 2*n-1; j++) {
                int top = i-1;
                int left = j-1;
                int bottom = 2*n-1-i;
                int right = 2*n-1-j;

                System.out.print(n - (Math.min(Math.min(top, bottom), Math.min(left, right))));
            }
            System.out.println();
        }
    }
}
