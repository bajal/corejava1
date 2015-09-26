import java.util.*;
import java.text.*;

class  calendarDemo
{
	public static void main(String[] args) 
	{
		 // initialize two calendars
         Calendar calendar1 = new GregorianCalendar(2007,Calendar.FEBRUARY,16,0,0,0);
         Calendar calendar2 = new GregorianCalendar(2007,Calendar.FEBRUARY,18,0,1,0);
        
         // define date format
         SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy hh:mm aaa");     

         // add 2d to calendar #1
         calendar1.add(Calendar.DAY_OF_MONTH, 2);
        
         // subtract 1min from calendar #2
         calendar2.add(Calendar.MINUTE, -1);
        
         // compare dates
         String date1 = sdf.format(calendar1.getTime());
         String date2 = sdf.format(calendar2.getTime());
         if((calendar1.compareTo(calendar2)) < 0)
         {
             System.out.println(date1 + " occurs before " + date2);
         }
         else if((calendar1.compareTo(calendar2)) > 0)
         {
             System.out.println(date1 + " occurs after " + date2);
         }
		 else
         {
             System.out.println("The two dates are identical: " + date1);
	 }
	}
}
