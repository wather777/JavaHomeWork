/**
 * Created by s_chernykh on 21.04.2017.
 */

import java.util.*;

public class AvgNums {
    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;

        System.out.println("Enter the numbers for get avg ");


        while (conin.hasNext()) {
            if(conin.hasNextDouble()){
                sum += conin.nextDouble();
                count++;
            }
            else {
                String str = conin.next();
                if(str.equals("done")) break;
                else System.out.println("Data format error");
                return;
            }
        }
        conin.close();
        System.out.println("Avg :" + sum / count);
    }
}
