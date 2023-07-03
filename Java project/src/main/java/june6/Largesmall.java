package june6;

public class Largesmall {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3, 1, 50};
        int small = numbers[0];
        int large = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < small) {
                small = numbers[i];
            }
            if (numbers[i] > large) {
                large = numbers[i];
            }
        }

        System.out.println("Smallest number: " + small);
        System.out.println("Largest number: " + large);
    }
}
