/**
 * Created by s_chernykh on 18.04.2017.
 */
import java.util.*;
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();

        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("push from stack: ");

        while (adq.peek() !=null) {
            System.out.print(adq.pop() + " ");


        }
    }

}
