import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by s_chernykh on 19.04.2017.
 */
public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);


        Comparator<Integer> r = Collections.reverseOrder();

        Collections.sort(ll,r);
        System.out.println("reverse order ll: ");

        for (int i :ll)
            System.out.print(i+" ");

        System.out.println();

        Collections.shuffle(ll);

        System.out.println("shuffled order ll: ");

        for (int i :ll)
            System.out.print(i+" ");

        System.out.println();
        System.out.println("Min: "+Collections.min(ll));
        System.out.println("Max: "+Collections.max(ll));

    }
}
