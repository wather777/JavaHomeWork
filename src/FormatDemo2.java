import java.util.*;

/**
 * Created by s_chernykh on 21.04.2017.
 */
public class FormatDemo2 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        for (double i =1000; i <1.e+10 ; i*=100) {
            fmt.format("%g",i);
            System.out.println(fmt);

        }




        fmt.format("%n16: %x,  8: %o",196,196);

        System.out.println(fmt);




    }
}
