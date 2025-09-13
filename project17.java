import java.math.BigInteger;
import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two large integers as strings
        String aStr = scanner.nextLine();
        String bStr = scanner.nextLine();

        // Convert them to BigInteger
        BigInteger a = new BigInteger(aStr);
        BigInteger b = new BigInteger(bStr);

        // Output the sum
        System.out.println(a.add(b));

        // Output the product
        System.out.println(a.multiply(b));

        scanner.close();
    }
}
