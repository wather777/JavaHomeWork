/**
 * Created by s_chernykh on 27.04.2017.
 */
public class ReadConsole {

    public static void main(String[] args) {

        while (true) {

            System.out.print("Enter something : ");
            String input = System.console().readLine();

            if ("q".equals(input)) {
                System.out.println("Exit!");
                System.exit(0);
            }

            System.out.println("input : " + input);
            System.out.println("-----------\n");
        }

    }

}