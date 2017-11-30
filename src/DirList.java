import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by s_chernykh on 02.05.2017.
 */
public class DirList {
    public static void main(String[] args) {
        String dirname = "d:/";


        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {

                return Files.isWritable(entry);
            }
        };


        try (DirectoryStream<Path> dirstrm =
                     Files.newDirectoryStream(Paths.get(dirname),how)) {
            System.out.println("Directory of "+dirname);

            for (Path e:dirstrm
                 ) {
                BasicFileAttributes attribs = Files.readAttributes(e,BasicFileAttributes.class);

                if(attribs.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("      ");

                System.out.println(e.getName(0));
            }





        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
