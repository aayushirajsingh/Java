/* write a program that shows the use of date class */
package aayushi_java.Collection;
import java.util.*;
import java.text.*;

public class Date_class {
    public static void main(String[] args) 
    {
        Date d = new Date();
        DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,Locale.UK);
        String str = fmt.format(d);
        System.out.println(str);
    }
}