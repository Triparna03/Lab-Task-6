import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();  // Read the input string
        in.close();

        String reversed = new StringBuilder(s).reverse().toString();

        if (s.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
