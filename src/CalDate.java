import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate beTogether = LocalDate.of(2019,03,10);
        long days = ChronoUnit.DAYS.between(beTogether,now);
        LocalDate day100 = beTogether.plusDays(99);
        System.out.println(days);
    }
}