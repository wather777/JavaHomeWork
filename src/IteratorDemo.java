import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by s_chernykh on 18.04.2017.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");


        System.out.println("source content al: ");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " " );
        }
        System.out.println();


        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");
        }

        System.out.print("modifited contentent al: ");
        itr=al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " " );
        }
        System.out.println();


        System.out.print("modifited contentent al REVERSE: ");
        while (litr.hasPrevious()){
            String element = litr.previous();
            System.out.print(element+" ");
        }
        System.out.println();
        
    }

}
