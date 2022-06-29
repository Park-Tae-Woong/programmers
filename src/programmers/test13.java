package programmers;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class test13 {
    public static void main(String[] args) {
        LocalDate date =LocalDate.of(2016,1,1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase());

    }
}
