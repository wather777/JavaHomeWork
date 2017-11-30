/**
 * Created by s_chernykh on 19.04.2017.
 */
import java.util.*;

class TComp implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int i,j,k;
        String aStr, bStr;
        aStr=a;
        bStr=b;

        i = aStr.lastIndexOf(' ');

        j = bStr.lastIndexOf(' ');
        System.out.println("str A B: "+aStr+" i:"+i+" "+bStr+" j:"+j);
        System.out.println("compare: "+aStr.substring(i)+" "+(bStr.substring(j)));

        k = aStr.substring(i).compareTo(bStr.substring(j));
        System.out.println(k);
        if(k==0)
            return aStr.compareTo(bStr);

        else
            return k;
    }
}

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());



        tm.put("Вася Пупкин",new Double(2342.32));
        tm.put("Иван Иванов",new Double(233.12));
        tm.put("Петр Хренько",new Double(1234.00));
        tm.put("Александр Хренович",new Double(99.22));
        tm.put(" Хренько",new Double(-19.08));


        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me:set
                ) {
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());

        }
        System.out.println();

        double balance = tm.get("Иван Иванов");
        tm.put("Иван Иванов",balance+1000);
        System.out.println("new Jon Иван Иванов: " + tm.get("Иван Иванов"));

    }
}
