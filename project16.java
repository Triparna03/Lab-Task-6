import java.util.Scanner;
import java.math.BigInteger;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Read input as String
        scanner.close();

        BigInteger number = new BigInteger(input);

        if (number.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
