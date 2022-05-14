package date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Formatter {
    public static void main(String[] args) {
        LocalDateTime time =LocalDateTime.now();
        System.out.println("Before Formatting -"+time);
        DateTimeFormatter dtformat =DateTimeFormatter.ofPattern("E, yyyy-MM-dd HH:mm:ss");
        String formatted = time.format(dtformat);
        System.out.println("After Formatting -"+formatted);
    }
}
