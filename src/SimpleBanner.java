import java.applet.Applet;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by s_chernykh on 03.05.2017.
 */
public class SimpleBanner extends Applet implements Runnable {

    private String msg = " A Simple Moving Banner.";
    int X=50,Y=30;
    Thread t = null;
    private int state;
    private volatile boolean stopFlag;

    @Override
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    @Override
    public void start() {
        t = new Thread(this);
        stopFlag=false;
        t.start();
    }

    public void run() {

        while (state<=100) {
            try {

                repaint();
                setForeground(Color.black);
                Thread.sleep(250);
                if(stopFlag)
                    break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void stop() {
        stopFlag=true;
        t=null;
    }


    @Override
    public void paint(Graphics g) {
        char ch;
        state++;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;



        g.drawString(msg, X,Y);
        g.drawString(String.valueOf(state), 50,60);




    }
}
