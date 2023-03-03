/* program for of() */
package aayushi_java.Date_Time;
import java.time.LocalTime;

public class Time_of {
    public static void main(String[] args) 
    {
        LocalTime time = LocalTime.of(10,43,12);
        System.out.println(time);
    }   
}