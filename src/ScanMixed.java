/**
 * Created by s_chernykh on 21.04.2017.
 */
import java.util.*;
import java.io.*;

public class ScanMixed {
    public static void main(String[] args) throws IOException {
        int i;
        double d;
        boolean b;
        String str;

        FileWriter fout = new FileWriter("d:/testjFile.txt");
        fout.write("Testing Scanner 10 12.2 один true два false");
        fout.close();

        FileReader fin = new FileReader("d:/testjFile.txt");

        Scanner src = new Scanner(fin).useLocale(Locale.US);

        while (src.hasNext()) {
            if(src.hasNextInt()){
                i = src.nextInt();
                System.out.println("int: "+i);
            }
            else if(src.hasNextDouble()) {
                d = src.nextDouble();
                System.out.println("double: "+ d);
            }
            else if(src.hasNextBoolean()) {
                b = src.nextBoolean();
                System.out.println("Boolean: "+ b);
            }
            else  {
                str = src.next();
                System.out.println("String: "+ str);
            }
        }
        src.close();
 double dd = 2323.3423432;
        System.out.println(dd);
    }
}
