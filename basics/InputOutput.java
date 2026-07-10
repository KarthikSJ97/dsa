import java.util.Scanner;

class InputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNumber(sc);
    }

    public static void printNumber(Scanner sc) {
        int a = sc.nextInt();
        System.out.println(a);
    }
}