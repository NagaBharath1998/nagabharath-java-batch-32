package june6;

import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));

        int n = arr.length;
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - x) % n;
            rotatedArray[newIndex] = arr[i];
        }
        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
    }
}
