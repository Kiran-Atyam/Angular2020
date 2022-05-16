package Exception.util;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class CurrentDateAndFinalDate {

    public static void main(String[] args) {
    LocalDate currentDate = LocalDate.now();
    LocalDate finalDate = LocalDate.of(2022, Month.MAY, 23);
    long noOfDays=ChronoUnit.DAYS.between(currentDate, finalDate);
    System.out.println(noOfDays);
    }
    
}
