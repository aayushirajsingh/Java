/* program for isLeapyear() */
package aayushi_java.Date_Time;
import java.time.LocalDate;

public class Date_isleapyear {
    public static void main(String[] args) 
    {
        LocalDate date1 = LocalDate.of(2017,1,13);
        System.out.println(date1.isLeapYear());
        LocalDate date2 = LocalDate.of(2016,9,23);
        System.out.println(date2.isLeapYear());
    }
}