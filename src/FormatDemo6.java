/**
 * Created by s_chernykh on 21.04.2017.
 */

import java.util.*;

public class FormatDemo6 {
    public static void main(String[] args) {
        Formatter f = new Formatter();


        f.format("%tH:%<tM %<te.%<tm.%<tY", new Date());
        System.out.println(f);
        f.close();
    }
}
