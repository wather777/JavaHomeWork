import java.util.ArrayList;

/**
 * Created by s_chernykh on 17.04.2017.
 */
public class ArrayListToArray {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        System.out.println("Начальный размер al: " + al.size());

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);


        System.out.println("content of al: "+al);

        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;

        for (int i:ia) sum  +=i;

        System.out.println("sum: "+sum );



    }

}