import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Read integer input
        sc.close(); // Close the scanner (good practice)

        // Convert the integer to a string
        String s = Integer.toString(n);

        // Check if the conversion is correct
        if (s.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
