import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by s_chernykh on 08.06.2017.
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat;

        simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        simpleDateFormat = new SimpleDateFormat("dd MM  yyyy hh:mm:ss z");
        System.out.println(simpleDateFormat.format(date));


        simpleDateFormat = new SimpleDateFormat("E MMM dd yyyy");
        System.out.println(simpleDateFormat.format(date));


    }
}
