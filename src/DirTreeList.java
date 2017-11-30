import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by s_chernykh on 02.05.2017.
 */


class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.printf("%-70.60s %-7.2f Mb%n",file.getFileName(),(float) attrs.size()/1024/1024);
        return FileVisitResult.CONTINUE;
    }


}


public class DirTreeList {
    public static void main(String[] args) {




        String dirname = "C:\\Users\\s_chernykh\\Downloads\\";
        System.out.println("Directory tree starting with " + dirname + ":\n");

        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
