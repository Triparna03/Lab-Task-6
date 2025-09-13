import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();  // Read the full input line
        scan.close();

        // Split the string based on non-letter characters
        String[] tokens = s.trim().split("[^A-Za-z]+");

        // Check if string was empty after trimming
        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
