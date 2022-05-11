import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
       // ZoneId.getAvailableZoneIds().forEach(System.out::println);
        System.out.println(LocalTime.now(ZoneId.of("Asia/Kolkata")));
    }
    
}
