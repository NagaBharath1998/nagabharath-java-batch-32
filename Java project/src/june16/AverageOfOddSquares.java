package june16;

public class AverageOfOddSquares {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        double average = calculateAverageOfOddSquares(numbers);
        System.out.println("Average of squares of odd numbers: " + average);
    }

    public static double calculateAverageOfOddSquares(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {  // Check if the number is odd
                int square = num * num;
                sum += square;
                count++;
            }
        }
        return count > 0 ? (double) sum / count : 0.0;
    }
}

