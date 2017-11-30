/**
 * Created by s_chernykh on 26.04.2017.
 */

import java.io.*;
import java.util.*;

class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files) {
    this.files = files.elements();
    }

    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    public FileInputStream nextElement() {
        try{
            return new FileInputStream(files.nextElement().toString());
        }catch (IOException e) {
            return null;
        }
    }


}


public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<String>();

        files.addElement("D:\\kem-dhcp3.txt");
        files.addElement("D:\\kem-dhcp2.txt");
        files.addElement("D:\\kem-dhcp.txt");

        InputStreamEnumerator ise = new InputStreamEnumerator(files);

        try (InputStream input = new SequenceInputStream(ise)){

            while ((c = input.read())!=-1)
                System.out.print((char) c);
        } catch (NullPointerException e) {
            System.out.println("Error Opening File.");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
