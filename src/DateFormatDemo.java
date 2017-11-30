import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by s_chernykh on 08.06.2017.
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.DEFAULT,Locale.getDefault());


        System.out.println("japan: "+df.format(date));
    }
}
