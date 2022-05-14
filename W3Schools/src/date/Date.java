package date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Date {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date is "+date);
        LocalTime time = LocalTime.now();
        System.out.println("Time is "+time);
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("Date and Time is "+datetime);

    }
}
