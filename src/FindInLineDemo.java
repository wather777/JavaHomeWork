/**
 * Created by s_chernykh on 21.04.2017.
 */

import java.util.*;

public class FindInLineDemo {
    public static void main(String[] args) {
        String instr = "Name: Tom Age: 28 ID:77";
        Scanner conin = new Scanner(instr);


        conin.findInLine("Age: ");
        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("error!");
        conin.close();
    }
}
