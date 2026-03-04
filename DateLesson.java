import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateLesson {
    public static void main(String[] args) {

        // use date
        LocalDate date =  LocalDate.now();
        System.out.println(date);
        // use time
        LocalTime time = LocalTime.now();
        System.out.println(time);
        // use both
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        // UTC
        Instant instant = Instant.now();
        System.out.println(instant);
        // format it

        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:SS");
        String newDateTime1 = dateTime1.format(formatter);
        System.out.println(newDateTime1);
        // place a date you can also compare
        LocalDateTime datePast = LocalDateTime.of(2025,12,25,12,00,00);
        LocalDateTime datePast2 = LocalDateTime.of(2021,11,25,12,10,00);
        System.out.println(datePast);
        System.out.println(datePast2);
        if (datePast.isBefore(datePast2)) {
            System.out.println("First date older than second");
        }else if (datePast.equal(datePast2)) {
            System.out.println("First date equals second date")}
else {
            System.out.println("Second older than the first");
        }
    }
}
