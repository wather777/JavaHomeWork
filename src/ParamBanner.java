import java.applet.Applet;
import java.awt.*;

/**
 * Created by s_chernykh on 04.05.2017.
 */

/*
<applet code

 */

public class ParamBanner extends Applet implements Runnable {
    String msg;
    Thread t = null;
    int state;
    volatile boolean stopFlag;

    @Override
    public void init() {
        setBackground(Color.lightGray);
        setForeground(Color.orange);
    }

    @Override
    public void start() {
        msg = getParameter("message");
        if (msg==null) msg = "message not found.";
        msg = " " + msg;
        t = new Thread(this);
        stopFlag=false;
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            try{
                repaint();
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
        stopFlag = true;
        t = null;
    }

    @Override
    public void paint(Graphics g) {
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;

        g.drawString(msg,50,30);

    }
}
