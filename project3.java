import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble(); // Read the input amount
        scanner.close();

        // Define locales for different countries
        Locale us = Locale.US;
        Locale india = new Locale("en", "IN"); // Custom locale for India
        Locale china = Locale.CHINA;
        Locale france = Locale.FRANCE;

        // Create currency formatters for each locale
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(us);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(china);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(france);

        // Print formatted currency values
        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }
}
