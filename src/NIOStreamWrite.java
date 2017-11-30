import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by s_chernykh on 28.04.2017.
 */
public class NIOStreamWrite {
    public static void main(String[] args) {
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt"))))
        {
            for (int i = 0; i < 26; i++) {
                fout.write(('A'+i));

            }
            String s = String.format("\n%s", new Date());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
