/**
 * Created by s_chernykh on 21.04.2017.
 */

import java.util.*;

public class PrecisionDemo {
    public static void main(String[] args) {
        Formatter f = new Formatter();

        f.format("% d", -100);
        System.out.println(f);
        f.close();

        f = new Formatter();
        f.format("% d", 100);
        System.out.println(f);
        f.close();
        f = new Formatter();

        f.format("% d", -200);
        System.out.println(f);
        f.close();
        f = new Formatter();

        f.format("% d", 200);
        System.out.println(f);
        f.close();
    }
}
