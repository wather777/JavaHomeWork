import java.io.*;

/**
 * Created by s_chernykh on 12.04.2017.
 */
public class UseTrim {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter 'stop' for done");
        System.out.println("Enter state: ");
        do {
            str = br.readLine();
            str =str.trim();
            if(str.equals("Иллинойс"))
                System.out.println("Столица - Спрингфилд.");
            else if(str.equals("Миссури"))
                System.out.println("Столица - Джефферсон-сити.");
            else if(str.equals("Калифорния"))
                System.out.println("Столица - Сакраменто.");
            else if(str.equals("Вашингтон"))
                System.out.println("Столица - Олимпия.");
        }while (!str.equals("stop"));
    }
}
