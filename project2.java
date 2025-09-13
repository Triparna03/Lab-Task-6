import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution2 {

    // Complete the findDay function below.
    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day); // month is 0-based
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] days = {
            "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
            "THURSDAY", "FRIDAY", "SATURDAY"
        };

        return days[dayOfWeek - 1]; // Calendar.DAY_OF_WEEK starts from 1 (Sunday)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        sc.close();

        String result = findDay(month, day, year);
        System.out.println(result);
    }
}
