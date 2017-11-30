import java.applet.Applet;
import java.awt.*;

/**
 * Created by s_chernykh on 04.05.2017.
 */
public class StatusWindow extends Applet{
    @Override
    public void init() {
        setBackground(Color.lightGray);
    }


    @Override
    public void paint(Graphics g) {
        g.drawString("This is in applet window.", 30, 30);
        showStatus("Status Окна");
    }
}
