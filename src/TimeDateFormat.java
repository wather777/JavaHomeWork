/**
 * Created by s_chernykh on 21.04.2017.
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class TimeDateFormat {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY") ;




        fmt = new Formatter();
        System.out.println(fmt.format("%tc", cal));
        fmt = new Formatter();
        System.out.println(fmt.format("%tl:%tM", cal,cal));
        fmt = new Formatter();
        System.out.println(fmt.format("%tB %tb %tm", cal,cal,cal));


    }
}
