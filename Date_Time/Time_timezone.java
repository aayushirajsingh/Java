/* program for LocalTime */
package aayushi_java.Date_Time;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Time_timezone {
    public static void main(String[] args) 
    {
        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("India time zone: "+time1);
        LocalTime time2 = LocalTime.now(zone2);
        System.out.println("Japan time zone: "+time2);
        long hours = ChronoUnit.HOURS.between(time1,time2);
        System.out.println("Hours between two Time Zone: "+hours);
        long minutes = ChronoUnit.MINUTES.between(time1,time2);
        System.out.println("Minutes between two time zone: "+minutes);
    }
}