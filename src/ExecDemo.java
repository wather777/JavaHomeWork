/**
 * Created by s_chernykh on 13.04.2017.
 */
public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("cmd");
        }catch (Exception e) {
            System.out.println("Error start notepad");
        }
    }
}
