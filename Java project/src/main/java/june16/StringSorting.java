package june16;

import java.util.Arrays;
import java.util.Comparator;

public class StringSorting {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "grape"};
        sortStrings(strings);
        System.out.println(Arrays.toString(strings));
    }

    public static void sortStrings(String[] arr) {
        Arrays.sort(arr, Comparator.comparing(String::length).thenComparing((s1, s2) -> {
            if (s1.length() == s2.length()) {
                return Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1));
            } else {
                return 0;
            }
        }));
    }
}

