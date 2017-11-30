import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by s_chernykh on 03.04.2017.
 */
class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;

        //check both path
        if (args.length != 2) {
            System.out.println("Use: CopyFile from to ");
            return;
        }

        //Open and control both try
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
        }
    }
}