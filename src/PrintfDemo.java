import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by s_chernykh on 26.04.2017.
 */
public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Ниже следуют некоторые числовые значения " +
                "в различных форматах.\n");

        System.out.printf("Различные целочисленные:");
        System.out.printf("%d %(d %+d %05d\n",3,-3,3,3);

        System.out.printf("float default: %f\n", 1234567.123);
        System.out.printf("float default s zapyatoy: %,f\n", 1234567.123);

        System.out.printf(" -float default : %,f\n", -1234567.123);
        System.out.printf(" -float default : %,(f\n", -1234567.123);

        System.out.println();

        System.out.printf("- +:\n");
        System.out.printf("% ,.2f\n% ,.2f\n", -123.123,123.123);

        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        System.out.printf("data %tF", new Date());
    }
}
