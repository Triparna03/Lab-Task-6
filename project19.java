import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the 6x6 array
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Step 2: Initialize max sum to the lowest possible hourglass value (-9 * 7 = -63)
        int maxHourglassSum = Integer.MIN_VALUE;

        // Step 3: Loop through all valid hourglass positions
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int currentSum =
                        arr[i][j]     + arr[i][j+1]     + arr[i][j+2]
                                      + arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                // Update max sum if needed
                if (currentSum > maxHourglassSum) {
                    maxHourglassSum = currentSum;
                }
            }
        }

        // Step 4: Print the result
        System.out.println(maxHourglassSum);
    }
}
