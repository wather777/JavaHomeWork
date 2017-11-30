import java.applet.Applet;
import java.awt.*;

/**
 * Created by s_chernykh on 23.05.2017.
 */
public class CenterText extends Applet {
    final Font f = new Font("SansSerif", Font.BOLD, 18);

    @Override
    public void paint(Graphics g) {
        Dimension d = this.getSize();
        //g.setColor(Color.white);
        //g.fillRect(0, 0, d.width, d.height);
        //g.setColor(Color.black);
        g.setFont(f);
        drawCenteredString("This is centered.", d.width, d.height, g);
        g.drawRect(0,0,d.width-1,d.height-1);
    }

    public void drawCenteredString(String s, int w, int h, Graphics graphics) {
        FontMetrics fm = graphics.getFontMetrics();
        int x = (w - fm.stringWidth(s))/2;
        int y = (fm.getAscent() + (h - (fm.getAscent() + fm.getDescent())) / 2);
        graphics.drawString(s, x, y);

    }


}
