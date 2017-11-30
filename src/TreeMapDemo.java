import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by s_chernykh on 19.04.2017.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>();


        tm.put("Jon Dow",new Double(2342.32));
        tm.put("Tom smith",new Double(233.12));
        tm.put("Jein Beiker",new Double(1234.00));
        tm.put("Tod holl",new Double(99.22));
        tm.put("Ralf smith",new Double(-19.08));


        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me:set
             ) {
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());

        }
        System.out.println();

        double balance = tm.get("Jon Dow");
        tm.put("Jon Dow",balance+1000);
        System.out.println("new Jon Dow balance: " + tm.get("Jon Dow"));
    }
}
