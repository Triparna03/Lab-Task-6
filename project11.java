import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class MyRegex {
    String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}

public class Solution11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        Pattern pattern = Pattern.compile(myRegex.pattern);

        while (in.hasNext()) {
            String ip = in.next();
            Matcher matcher = pattern.matcher(ip);
            System.out.println(matcher.matches());
        }

        in.close();
    }
}
