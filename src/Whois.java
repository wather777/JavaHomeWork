import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by s_chernykh on 02.05.2017.
 */
public class Whois {
    public static void main(String[] args) throws Exception {
        int c;



        Socket s = new Socket("whois.internic.net", 43);

        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        String srt = (args.length==0 ? "www.nic.ru" :args[0])+"\n";

        byte buf[] = srt.getBytes();

        out.write(buf);

        while ((c = in.read()) != -1) {

            System.out.print((char) c);
        }
        s.close();


    }
}
