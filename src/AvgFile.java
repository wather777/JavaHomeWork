import java.util.*;
import java.io.*;

/**
 * Created by s_chernykh on 21.04.2017.
 */
public class AvgFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0;


        FileWriter fout = new FileWriter("d:/testjFile.txt");
        fout.write("2.5 3.4 5 6 7.4 9.1 10.5 готово");
        fout.close();


        FileReader fin = new FileReader("d:/testjFile.txt");
        Scanner src = new Scanner(fin);

        while (src.hasNext()) {
            if(src.hasNextDouble()){
                sum += src.nextDouble();
                count++;
            }
            else {
                String str = src.next();
                System.out.println(str);
                if(str.equals("готово")) break;
                else {
                    System.out.println("Data format error");
                    return;
                }
            }
        }
        src.close();
        System.out.println("Avg :" + sum / count);
    }
}
