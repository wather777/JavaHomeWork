import java.io.*;
import java.util.Date;

/**
 * Created by s_chernykh on 27.04.2017.
 */


public class ConsoleDemo {
    public static void main(String[] args) {

        Console con;

        con = System.console();
        System.out.println(con);
        if(con==null)return;

        String str = con.readLine("Enter string: ");
        con.readLine();
        System.out.println(str);

        con.printf("This your string: %s \n%tH",str,new Date());

    }
}
