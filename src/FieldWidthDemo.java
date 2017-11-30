/**
 * Created by s_chernykh on 21.04.2017.
 */
import java.util.*;

public class FieldWidthDemo {
    public static void main(String[] args) {
        Formatter fmt;

        for (int i = 0; i <=10 ; i++) {
            fmt = new Formatter();
            fmt.format("%4d %4d %4d ", i, i * i, i * i * i);
            System.out.println(fmt);
            fmt.close();

        }
    }
}
