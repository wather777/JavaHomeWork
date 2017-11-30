import java.util.LinkedList;

/**
 * Created by s_chernykh on 18.04.2017.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();


        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1,"A2");

        System.out.println("source content ll:"+ll);

        ll.remove("F");
        System.out.println("after remove" +ll);
        ll.remove(2);
        System.out.println("after remove" +ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println("after remove" +ll);



        ll.set(2,ll.get(2)+ " change");
        System.out.println("after change" +ll);

    }
}
