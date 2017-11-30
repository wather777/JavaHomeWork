import java.lang.reflect.Array;
import java.net.*;
import java.util.*;
import java.io.*;


/**
 * Created by s_chernykh on 03.05.2017.
 */
public class HttpURLDemo {
    public static void main(String[] args) throws Exception {
        URL hp = new URL("http://www.google.com");

        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();


        System.out.println("Meth response: " + hpCon.getRequestMethod());

        System.out.println("response answer: " + hpCon.getResponseCode());

        System.out.println("answer message: "+hpCon.getResponseMessage());


        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();

        Object[] Sarr= hdrField.toArray();

        TreeSet<String> SortKeys= new TreeSet<String>();

        for (Object s:Sarr
             ) {

                if(s==null)
                    SortKeys.add("null");
                else
                    SortKeys.add((String) s);
        }


        System.out.println("\n Здесь следует заголовок: \n" +
                "Key                                    |Value                                          \n" +
                "____________________________________________________________________________________________");

        for (String k:SortKeys
             ) {
            if(k!="null")
            System.out.printf("%-39s|%-50s\n",k,hdrMap.get(k));
            else
                System.out.printf("%-39s|%-50s\n",k,hdrMap.get(null));

        }
    }
}
