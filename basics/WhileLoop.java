import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int sum = whileLoop(d);
        System.out.println(sum);
        sc.close();
    }

    public static int whileLoop(int d) {
        // Your code goes here
        int sum = 0, i=1;
        
        while (i<=50) {
            sum += d;
            d = d + 10;
            i++;
        }

        return sum;
    }
}
