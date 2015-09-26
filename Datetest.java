import java.util.*; 
 
public class Datetest {   
   public static void main(String args[]) 
   {        
      Date today=new Date();                 	 
      Calendar cal = new GregorianCalendar();
      System.out.println(today + " " + cal.getTime());
      if(today.compareTo(cal.getTime())==0)
         System.out.println("Today Date is Lesser than my Date");

  }
}