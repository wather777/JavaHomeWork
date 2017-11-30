import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by s_chernykh on 07.06.2017.
 */
public class RegExpr2 {

    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 7");

        System.out.println("Поиск Java в Java 7.");

        if(mat.find()) System.out.println("Последовательность найденна");
        else System.out.println("Совпадений нет");
    }





}
