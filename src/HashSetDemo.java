import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by s_chernykh on 18.04.2017.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("A");
        hs.add("B");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");

        System.out.println(hs);
    }
}
