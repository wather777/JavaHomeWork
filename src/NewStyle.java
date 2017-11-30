/**
 * Created by s_chernykh on 19.04.2017.
 */
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by s_chernykh on 19.04.2017.
 */
public class NewStyle {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");

        Iterator <String> itr = list.iterator();

        while (itr.hasNext()){
            String str = itr.next();
            System.out.println(str+" имеет длину "+str.length()+" символов.");
        }
    }
}

