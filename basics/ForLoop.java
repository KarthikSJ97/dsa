import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int sum = forLoop(low, high);
        System.out.println(sum);
        sc.close();
    }

    public static int forLoop(int low, int high) {
        // Your code goes here
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        return sum;
    }
}
