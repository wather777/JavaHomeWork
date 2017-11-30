/**
 * Created by s_chernykh on 25.04.2017.
 */
import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all dood men\n" +
                "to come to the aid of their country\n" +
                "and pay their due taxes. ";
        byte buf[] = source.getBytes();

        try (FileOutputStream f0 = new FileOutputStream("D:\\java\\file1.txt");
             FileOutputStream f1 = new FileOutputStream("D:\\java\\file2.txt");
             FileOutputStream f2 = new FileOutputStream("D:\\java\\file3.txt");
                )

        {


            for (int i = 0; i <buf.length ; i+=2) {
                f0.write(buf[i]);
            }

            //f1 write
            f1.write(buf);
            //f2 write
            f2.write(buf,buf.length-buf.length/4,buf.length/4);



        } catch (IOException e) {
            e.printStackTrace();
        }

        }

    }

