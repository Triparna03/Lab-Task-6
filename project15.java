import java.math.BigDecimal;
import java.util.*;

class Solution15 {
    public static void main(String[] args) {
        // Read input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Sort array using custom comparator
        Arrays.sort(s, 0, n, new Comparator<String>() {
            public int compare(String a, String b) {
                // Convert to BigDecimal for numeric comparison
                BigDecimal aVal = new BigDecimal(a);
                BigDecimal bVal = new BigDecimal(b);
                // Descending order
                return bVal.compareTo(aVal);
            }
        });

        // Output sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
