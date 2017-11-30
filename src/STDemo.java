import java.util.StringTokenizer;

/**
 * Created by s_chernykh on 20.04.2017.
 */
public class STDemo {
    static String in = "title=java: The Complete Reference;"+
                                    "author=Schildt;"+
                                    "publisher=McGraw-Hill;"+
                                    "copyright=2011";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in,"=;");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t"+val);
        }
    }
}
