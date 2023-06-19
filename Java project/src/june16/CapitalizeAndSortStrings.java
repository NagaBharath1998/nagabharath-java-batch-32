package june16;

import java.util.Arrays;

public class CapitalizeAndSortStrings {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date"};
        capitalizeAndSortStrings(strings);
    }

    public static void capitalizeAndSortStrings(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String string = arr[i];
            arr[i] = string.substring(0, 1).toUpperCase() + string.substring(1);
        }

        Arrays.sort(arr);

        for (String string : arr) {
            System.out.println(string);
        }
    }
}

