import java.applet.Applet;
import java.awt.*;

/**
 * Created by s_chernykh on 22.05.2017.
 */
public class ColorDemo extends Applet {
    @Override
    public void paint(Graphics g) {
        Color c1 = new Color(255, 100, 100);
        Color c2 = new Color( 100,255, 100);
        Color c3 = new Color(100, 100, 255);


        g.setColor(c2);
        g.drawLine(0,0,100,100);
        g.drawLine(0,100,100,0);

    }
}
