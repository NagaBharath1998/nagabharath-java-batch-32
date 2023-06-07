package june6;

import java.util.Arrays;

public class ArrayReverse {
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - i - 1];
        }
        return reversed;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] reversedArray = reverseArray(arr);

        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}
