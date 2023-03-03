/* program for atTime() */
package aayushi_java.Date_Time;
import java.time.*;

public class Date_attime {
    public static void main(String[] args) 
    {
        LocalDate date = LocalDate.of(2017,1,13);
        LocalDateTime datetime = date.atTime(1,50,9);
        System.out.println(datetime);
    }
}