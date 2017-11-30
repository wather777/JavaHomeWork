import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by s_chernykh on 20.04.2017.
 */
public class GrigCalendarDemo {
    public static void main(String[] args) {
        String months[] = {
                "Jan","Feb","Mar","Apr",
                "May","Jun","Jul","Aug",
                "Sep", "Oct", "Nov","Dec"
        };
        int year;

        GregorianCalendar gcalendar = new GregorianCalendar();


        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" "+gcalendar.get(Calendar.DATE)+" ");
        System.out.println(year= gcalendar.get(Calendar.YEAR));

        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR)+":");
        System.out.print(gcalendar.get(Calendar.MINUTE)+":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        if(gcalendar.isLeapYear(year))
            System.out.println("its Leap year");
        else
            System.out.println("i't Leap year");

    }
}
