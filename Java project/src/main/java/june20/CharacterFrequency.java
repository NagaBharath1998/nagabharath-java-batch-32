package june20;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "test string";
        printDistinctCharacters(input);
    }

    public static void printDistinctCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Counting the occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Printing the distinct characters and their counts
        System.out.println("Distinct characters and their counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}


