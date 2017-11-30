import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by s_chernykh on 02.05.2017.
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.herbschildt.com");
        System.out.println("address = " + address);

        for (InetAddress a:InetAddress.getAllByName("www.nba.com")
             ) {
            System.out.println("a = " + a.getHostAddress());

        }
    }
}
