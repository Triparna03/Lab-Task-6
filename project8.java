import java.util.*;

public class Solution8 {

    public static boolean isAnagram(String a, String b) {
        // Convert both strings to lowercase for case-insensitive comparison
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        // If lengths are different, they can't be anagrams
        if (aLower.length() != bLower.length()) {
            return false;
        }

        // Count character frequencies for both strings
        Map<Character, Integer> freqA = new HashMap<>();
        Map<Character, Integer> freqB = new HashMap<>();

        for (char c : aLower.toCharArray()) {
            freqA.put(c, freqA.getOrDefault(c, 0) + 1);
        }

        for (char c : bLower.toCharArray()) {
            freqB.put(c, freqB.getOrDefault(c, 0) + 1);
        }

        // Compare the frequency maps
        return freqA.equals(freqB);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine().trim();
        String b = scanner.nextLine().trim();

        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        scanner.close();
    }
}
