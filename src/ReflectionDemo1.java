import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by s_chernykh on 08.06.2017.
 */
public class ReflectionDemo1 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.awt.Dimension");
            System.out.println("Constructors: ");
            Constructor constructors[] = c.getConstructors();
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(" " + constructors[i]);
            }

            System.out.println("Fields: ");
            Field fields[] = c.getFields();
            for (Field f: fields
                 ) {
                System.out.println(" "+f);
            }

            System.out.println("Methods: ");
            Method methods[] = c.getMethods();
            for (Method m:methods
                 ) {
                System.out.println(" " + m);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
