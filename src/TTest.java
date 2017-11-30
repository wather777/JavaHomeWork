
import java.util.*;

/**
 * Created by s_chernykh on 21.04.2017.
 */
class MyTimerTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("Задание таймера выполняется. ");
    }
}

public class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();

        Timer myTimer = new Timer();
        myTimer.schedule(myTask,1000,500);
        try {
            Thread.sleep(8000);
        }catch (InterruptedException e){}
        myTimer.cancel();

    }
}
