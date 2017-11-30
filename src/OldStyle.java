import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by s_chernykh on 19.04.2017.
 */
public class OldStyle {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");

        Iterator itr = list.iterator();

        while (itr.hasNext()){
            String str = (String) itr.next();
            System.out.println(str+" имеет длину "+str.length()+" символов.");
        }
    }
}
