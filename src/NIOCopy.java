import java.io.IOException;
import java.nio.file.*;

/**
 * Created by s_chernykh on 28.04.2017.
 */
public class NIOCopy {
    public static void main(String[] args) {
        if (args.length !=2){
            System.out.println("Usage: Copy from to");

        }

        try {
            Path source = Paths.get(args[0]);
            Path target = Paths.get(args[1]);

            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
