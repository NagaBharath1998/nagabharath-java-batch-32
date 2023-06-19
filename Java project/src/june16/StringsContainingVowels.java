package june16;

public class StringsContainingVowels {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "grape"};
        printStringsContainingVowels(strings);
    }

    public static void printStringsContainingVowels(String[] arr) {
        for (String string : arr) {
            int numVowels = countVowels(string);
            if (numVowels > 0) {
                System.out.println(string + ": " + numVowels + " vowels");
            }
        }
    }

    public static int countVowels(String string) {
        string = string.toLowerCase();  // Convert to lowercase for easier vowel comparison
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

