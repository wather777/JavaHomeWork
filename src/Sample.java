import java.applet.Applet;
import java.awt.*;

/**
 * Created by s_chernykh on 03.05.2017.
 */
public class Sample extends Applet {
    String msg;

    @Override
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "Inside init() --";
    }

    @Override
    public void start() {
        msg += " Inside start() --";
    }

    @Override
    public void paint(Graphics g) {
        msg += " Inside paint().";
        g.drawString(msg, 10, 30);
    }
}
