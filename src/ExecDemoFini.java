/**
 * Created by s_chernykh on 13.04.2017.
 */
public class ExecDemoFini {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("notepad");
            System.out.println(            p.getOutputStream());
            p.waitFor();

        }catch (Exception e) {
            System.out.println("Error start notepad");
        }
        System.out.println("Notepad возвратил "+ p.exitValue());
    }
}
