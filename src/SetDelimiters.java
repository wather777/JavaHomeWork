/**
 * Created by s_chernykh on 21.04.2017.
 */
import java.util.*;
import java.io.*;

public class SetDelimiters {
    public static void main(String[] args) throws IOException {

        int count = 0;
        double sum = 0;


        FileWriter fout = new FileWriter("d:/testjFile.txt");
        fout.write("2, 3.4, 5.6, 7.4, 9.1, 10.5, done");
        fout.close();

        FileReader fin = new FileReader("d:/testjFile.txt");

        Scanner src = new Scanner(fin).useLocale(Locale.US);

        src.useDelimiter(", *");

//        System.out.println(src.delimiter());

        while (src.hasNext()) {
//            System.out.println("next: "+src.next());

            if (src.hasNextDouble()) {
//                System.out.println("d tru: "+src.hasNextDouble());
//                System.out.println("d: "+src.nextDouble());
                sum += src.nextDouble();
                count++;

            }
            else {
//                System.out.println("next2: "+src.hasNext());
                String str = src.next();
                System.out.println(str);
//                System.out.println("str:"+str);
                if (str.equals("done")) break;
                else {
                    System.out.println("data error");
                    return;
                }
            }

        }
        src.close();
        System.out.println("Avr: " + sum / count);
    }
}