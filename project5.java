import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S = in.next();       // Read the input string
        int start = in.nextInt();   // Read start index
        int end = in.nextInt();     // Read end index
        in.close();

        // Print the substring from index start (inclusive) to end (exclusive)
        System.out.println(S.substring(start, end));
    }
}
