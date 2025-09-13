import java.util.*;
import java.util.regex.*;

public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Regular expression to match valid tags with same name
        // <([^>]+)> captures the tag name in group 1
        // ([^<]+) captures the content in group 2 (must not contain '<')
        // </\\1> matches the closing tag with the same name as group 1
        Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>");

        while (n-- > 0) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            while (matcher.find()) {
                String content = matcher.group(2);
                System.out.println(content);
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        scanner.close();
    }
}
