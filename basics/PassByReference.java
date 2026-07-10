import java.util.Arrays;

public class PassByReference {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 5, 1 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            arr[left] = arr[left] + arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];

            left++;
            right--;
        }

    }
}
