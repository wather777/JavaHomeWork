import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by s_chernykh on 07.06.2017.
 */
 class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();


        System.out.println("Test match Java Javf");
        if(found) System.out.println("match");
        else System.out.println("not match");

        System.out.println();

        System.out.println("test match java java 7");
        mat = pat.matcher("Java 7");

        found = mat.matches();
        if(found) System.out.println("match");
        else System.out.println("not match");

    }
}
