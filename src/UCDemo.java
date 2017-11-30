import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * Created by s_chernykh on 03.05.2017.
 */
public class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL hp = new URL("http://www.hclass.ru");
        URLConnection hpCon = hp.openConnection();


        long d = hpCon.getDate();
        System.out.println((d == 0 ? "No data info" : "Date: " + new Date(d)));


        System.out.println("Content type: "+hpCon.getContentType());

        d = hpCon.getExpiration();
        System.out.println((d == 0 ? "No exp info" : "Expir: "+ new Date(d)));

        d = hpCon.getLastModified();

        System.out.println( d== 0 ? "No last mod date" :"Last mod: "+new Date(d));

        long len = hpCon.getContentLengthLong();
        System.out.println(len == -1 ? "Long not available":"Long: "+len);

        if (len !=0){
            System.out.println("==========Content===========");
            InputStream input = hpCon.getInputStream();
            while ((c=input.read())!=1) {
                System.out.print((char)c);
            }
            input.close();
        }else {
            System.out.println("Content not available");
        }


    }
}
