import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by s_chernykh on 25.04.2017.
 */


public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This should end up in the array";
        byte buf[] =s.getBytes();

        try{
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("Into array");
        byte b[] =f.toByteArray();
        for (int i = 0; i < b.length; i++) System.out.print((char) b[i]);

        System.out.println("\nTo an OutputStream()");

        try (FileOutputStream f2 = new FileOutputStream("testx.txt")) {
            f.writeTo(f2);
        }catch (IOException e) {
        e.printStackTrace();
                }

        System.out.println("Doing a reset");
        f.reset();

        for (int i = 0; i <3 ; i++) {
            f.write('X');
        }

        System.out.println(f.toString());

        }
    }