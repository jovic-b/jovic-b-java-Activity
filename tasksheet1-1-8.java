public class Main {
    public static void main(String[] args) {
        // Test the sum method with different arguments
        sum(4, 5, 10);
    }

    public static void sum(int... numbers) {
        int totalSum = 0;
        int cumulativeSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            cumulativeSum = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                cumulativeSum += j;
            }
            totalSum += cumulativeSum;

            System.out.println("Parameter " + (i + 1) + ": " + numbers[i] + " = " + cumulativeSum);
        }

        System.out.println("Total Sum: " + totalSum);
    }
}

