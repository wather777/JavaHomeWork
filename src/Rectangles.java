import java.applet.Applet;
import java.awt.*;

/**
 * Created by s_chernykh on 22.05.2017.
 */
public class Rectangles extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawRect(10, 10, 60, 50);
        g.fillRect(100, 10, 60, 50);
        g.drawRoundRect(190, 10, 60, 50, 15, 15);
        g.fillRoundRect(70,90,140,100,30,40);
    }
}
