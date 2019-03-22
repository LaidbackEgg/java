package Lab1;

import java.util.*;

public class Calendar1 {
    public static void main (String [] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.print(calendar.get(Calendar.DATE) + "/");
        System.out.print(calendar.get(Calendar.MONTH) + "/");
        System.out.print(calendar.get(Calendar.YEAR));
    }
}


//work out someone's age using the calendar

//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//public class Calendar1 {
//
//    public static void main(String[] args) {
//        Calendar cal = new GregorianCalendar(1984, 4, 15);
//        Calendar now = new GregorianCalendar();
//        int res = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
//        if ((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH))
//                || (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) && cal.get(Calendar.DAY_OF_MONTH) > now
//                .get(Calendar.DAY_OF_MONTH))) {
//            res--;
//        }
//        System.out.println(res);
//    }
//}