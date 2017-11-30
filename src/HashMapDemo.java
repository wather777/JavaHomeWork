import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by s_chernykh on 19.04.2017.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("Jon Dow",new Double(2342.32));
        hm.put("Tom smith",new Double(233.12));
        hm.put("Jein Beiker",new Double(1234.00));
        hm.put("Tod holl",new Double(99.22));
        hm.put("Ralf smith",new Double(-19.08));


        Set<Map.Entry<String,Double>> set = hm.entrySet();


        for (Map.Entry<String,Double> me:set
             ) {
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("Jon Dow");
        hm.put("Jon Dow",balance+1000);
        System.out.println("new Jon Dow balance: " + hm.get("Jon Dow"));

    }
}
