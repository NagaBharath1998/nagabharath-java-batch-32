package june12;

public class StringToInt {
    public static void main(String[] args) {
        String[] inputs = {"23", "50", "45.67", "test", "123f"};

        for (String input : inputs) {
            try {
                int result = Integer.parseInt(input);
                System.out.println("Converted value of '" + input + "': " + result);
            } catch (NumberFormatException e) {
                System.out.println(input + " Cannot be converted to an integer.");
            }
        }
    }
}

