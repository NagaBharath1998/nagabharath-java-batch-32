package june7;

import java.util.Arrays;

public class AnagramString {
    public static boolean areAnagrams(String str1, String str2) {

        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");


        if (str1.length() != str2.length()) {
            return false;
        }


        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();


        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
