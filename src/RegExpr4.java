import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by s_chernykh on 08.06.2017.
 */
public class RegExpr4 {
    public static void main(String[] args) {

        String str = "Jon Jonathan Frank Ken Todd";

        Pattern pat = Pattern.compile("Jon.*?");
        Matcher mat = pat.matcher(str);

        System.out.println("Source: " + str);
        str = mat.replaceAll("Eric ");

        System.out.println("Replaced: "+str);

        while (mat.find())
            System.out.println("Совпадение: " + mat.group());
    }
}
