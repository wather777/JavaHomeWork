import java.lang.reflect.Field;

/**
 * Created by s_chernykh on 13.04.2017.
 */
public class PBDemo {
    String as;
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {


        String str =  System.getProperties().toString();
        System.out.println(PBDemo.class.getField("as"));

    }
}
