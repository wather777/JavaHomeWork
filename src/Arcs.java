import java.applet.Applet;
import java.awt.*;

/**
 * Created by s_chernykh on 22.05.2017.
 */
public class Arcs extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawArc(10, 40, 70, 70, 0, 75);
        g.fillArc(100, 40, 70, 70, 0, 75);
        g.drawArc(10, 100, 70, 80, 0, 175);
        g.fillArc(100, 100, 70, 90, 0, 270);
        g.drawArc(200,80,80,80,0,180);
    }
}
