import java.util.Date;
import java.util.Formatter;

/**
 * Created by s_chernykh on 21.04.2017.
 */
public class FormatDemo {
    public static void main(String[] args) {


        try (Formatter fmt = new Formatter()) {

            fmt.format("Форматирование  %s  %tT %f", "asdsad", new Date(), 98.6);

            System.out.println(fmt);
        }
    }
}
