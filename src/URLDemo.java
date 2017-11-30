import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by s_chernykh on 02.05.2017.
 */
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.herbschildt.com/articles");

        System.out.println("Protocol: "+hp.getProtocol());
        System.out.println("Port: "+hp.getPort());
        System.out.println("Host: "+hp.getHost());
        System.out.println("File: "+hp.getFile());
        System.out.println("Целиком: "+hp.toExternalForm());
    }
}
