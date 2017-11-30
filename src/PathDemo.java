import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by s_chernykh on 28.04.2017.
 */
public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("D:\\dkim\\mail.txt");

        System.out.println("File name " + filepath.getName(1));
        System.out.println("Path " + filepath);
        System.out.println("absolut Path " + filepath.toAbsolutePath());
        System.out.println("parent " + filepath.getParent());

        if(Files.exists(filepath))
            System.out.println("File exists");
        else
            System.out.println("File don't exist");

        try {
            if(Files.isHidden(filepath))
                System.out.println("File is hidden");
            else
                System.out.println("File is not hidden");

        } catch (IOException e) {
            e.printStackTrace();
        }
        Files.isWritable(filepath);
        System.out.println("File is W");
        Files.isReadable(filepath);
        System.out.println("File is R");

        try {
            BasicFileAttributes attribs = Files.readAttributes(filepath, BasicFileAttributes.class);

            Class c = attribs.getClass();

            for (Method m:attribs.getClass().getDeclaredMethods()
                 ) {
                if(m.getParameterCount()==0) {


                    m.setAccessible(true);


                    System.out.printf("Имя метода %2$s результат: %1$s\n",m.getName(),m.invoke(attribs,null));
                }


            }



        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
