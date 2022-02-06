package LAB_04;
import java.util.*;
public class Lab04_Pro2_64010757 {

	public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + g.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + g.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + g.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + g.get(GregorianCalendar.DAY_OF_WEEK));
       
        System.out.println("------------\nAfter specified the elapsed time of one day after current day");
        final long MILLIS_OF_ONE_DAY = 86400000; 
        final long ELAPSED_TIME_AFTER_CURRENT_DAY = g.getTimeInMillis() + MILLIS_OF_ONE_DAY;
        
        g.setTimeInMillis(ELAPSED_TIME_AFTER_CURRENT_DAY);
        
        System.out.println("Year is " + g.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + g.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + g.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + g.get(GregorianCalendar.DAY_OF_WEEK));		
        System.out.println(g.getTime());
	}

}
