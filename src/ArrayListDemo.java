import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by s_chernykh on 17.04.2017.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Начальный размер al: "+al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        System.out.println("Размер al после вставки: "+ al.size());



        System.out.println("Содержимое al: "+ al);

        al.remove("F");
        al.remove(2);


        System.out.println("Размер al после удаления: "+ al.size());

        System.out.println("Содержимое al: "+ al);




    }
}
