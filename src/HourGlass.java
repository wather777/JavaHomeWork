import java.applet.Applet;
import java.awt.*;

/**
 * Created by s_chernykh on 22.05.2017.
 */
public class HourGlass extends Applet {
    @Override
    public void paint(Graphics g) {
        int xpoints[] = {30, 200, 30, 200, 30, 12};
        int ypoints[] = {30, 30, 200, 200, 30, 543};
        int num = 3;
        g.drawPolygon(xpoints, ypoints, num);

    }
}
